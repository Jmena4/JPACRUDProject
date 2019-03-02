package com.skilldistillery.tiredata.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.tiredata.entities.Tire;

@DisplayName("Tire Entity Tests")
class TireTest {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TireStorePU");
	private EntityManager em;
	private Tire tire;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("In BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {

		em = emf.createEntityManager();
		tire = em.find(Tire.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
//		emf.close();
		tire = null;
	}

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void test_tire_mapping() {
		assertEquals("Sonomo", tire.getName());
		assertEquals("2009-12-10", tire.getManufacturedDate().toString());
		assertEquals("22.5", tire.getSize().toString());
		assertEquals(150, tire.getPurchasePrice());
		assertEquals("A not so better choice", tire.getProductDescription());
		assertEquals("US", tire.getOriginCountryCode());

	}
}
