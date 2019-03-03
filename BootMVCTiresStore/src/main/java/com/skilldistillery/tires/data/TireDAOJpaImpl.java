package com.skilldistillery.tires.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.tiredata.entities.Tire;

@Transactional
@Service
public class TireDAOJpaImpl implements TireDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Tire findById(int id) {

		return em.find(Tire.class, id);
	}

	@Override
	public List<Tire> findAll() {
		List<Tire> tires = null;
		String sql = "SELECT tire FROM Tire tire";
		tires = em.createQuery(sql, Tire.class).getResultList();
		return tires;
	}
//int id, String name, Date manufacturedDate, Double size, double purchasePrice,
//	String productDescription, String originCountryCode

	@Override
	public Boolean create(int id) {
		Tire tire = em.find(Tire.class, id);
//		em.getTransaction().begin();
		em.persist(tire);
		em.flush();
		Boolean test = !em.contains(tire);
//		em.getTransaction().commit();
		em.close();
		return test;
	}

	@Override
	public Tire update(int id, Tire tire) {
		em.getTransaction().begin();
		Tire managedCustomer = em.find(Tire.class, id);

		managedCustomer.setName("New Name");
		em.getTransaction().commit();
		em.close();
		return managedCustomer;
	}

	@Override
	public Boolean delete(int id) {
		Tire tire = em.find(Tire.class, id);
//		em.getTransaction().begin();
		em.remove(tire);
//		em.getTransaction().commit();
		Boolean test = !em.contains(tire);
		em.close();
		return test;
	}

}
