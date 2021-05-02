package com.leaf.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscriptionTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Subscription subscription;

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
		subscription = em.find(Subscription.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		subscription = null;
	}

	@Test
	void test() {
		assertNotNull(subscription);
		assertEquals("cactus", subscription.getName());	
		assertEquals(true, subscription.isFlowering());	
	}

}
