package com.skilldistillery.tiredata.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.tiredata.entities.Tire;

public class TireClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TireStorePU");
		EntityManager em = emf.createEntityManager();
		Tire tire = em.find(Tire.class, 1);
		System.out.println(tire);

		em.close();
		emf.close();
	}

}
