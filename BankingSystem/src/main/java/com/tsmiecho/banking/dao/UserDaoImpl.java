package com.tsmiecho.banking.dao;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.tsmiecho.banking.pojo.User;

/**
 * Hibernate implementation of UserDao.
 *
 * @author Tomasz Śmiechowicz
 */
@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	@PersistenceUnit
	protected EntityManagerFactory entityManagerFactory;

	@Override
	public void createUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void deleteUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	//TODO now only name
	@Override
	public Set<User> findUsers(String val) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> query = cb.createQuery(User.class);

		Root<User> userRoot = query.from(User.class);
		Predicate predicate = cb.equal(userRoot.get("name"), cb.parameter(String.class, "nameValue"));
		query.where(predicate);
		TypedQuery<User> tq = entityManager.createQuery(query);
		tq.setParameter("nameValue", val);
		List<User> users = tq.getResultList();

		if (!CollectionUtils.isEmpty(users)) {
			if (logger.isDebugEnabled()) {
				logger.debug("User list is not empty " + users);
			}
			return Collections.unmodifiableSet(users.stream().distinct().collect(Collectors.toSet()));
		}

		if (logger.isDebugEnabled()) {
			logger.debug("User list is empty ");
		}
		return Collections.emptySet();
	}

	@Override
	public void deleteUserById(String userId) {
		//TODO
	}

}
