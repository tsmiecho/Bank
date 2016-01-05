package com.tsmiecho.banking.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.tsmiecho.banking.pojo.User;

/**
 * Hibernate implementation of UserDao.
 *
 * @author Tomasz Śmiechowicz
 */
@Repository
public class UserDaoImpl implements UserDao {

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

}
