package com.leaf.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private User user;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("LeafPU");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		user = em.find(User.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		user = null;
	}

	@Test
	void test() {
		assertNotNull(user);
		assertEquals("DrFuzz", user.getUsername());	
		assertEquals("fuzzy", user.getPassword());	
		assertEquals("Pierce", user.getFirstName());	
		assertEquals("Steward", user.getLastName());	
		assertEquals("drfuzz@gmail.com", user.getEmail());	
	}

	@Test
	void test_user_to_address() {
		assertNotNull(user);
		assertNotNull(user.getAddress());
		assertNotNull(user.getSubscription());
		assertTrue(user.getAddress().getId()==1);
		assertTrue(user.getSubscription().getId()==1);
	}
}
