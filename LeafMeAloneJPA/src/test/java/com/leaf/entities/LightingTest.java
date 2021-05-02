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

public class LightingTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Lighting lighting;

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
		lighting = em.find(Lighting.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		lighting = null;
	}

	@Test
	void test() {
		assertNotNull(lighting);
		assertEquals("Low", lighting.getName());
	
	}

}
