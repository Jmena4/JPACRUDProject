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
	public Tire create(Tire tire) {
//		tire = em.find(Tire.class, id);
//		em.getTransaction().begin();
		em.persist(tire);
		em.flush();
//		Boolean test = !em.contains(tire);
//		em.getTransaction().commit();
		em.close();
		return tire;
	}

	@Override
	public Tire update(int id, Tire tire) {
		Tire managedCustomer = em.find(Tire.class, tire.getId());
		managedCustomer.setManufacturedDate(tire.getManufacturedDate());
		managedCustomer.setName(tire.getName());
		managedCustomer.setProductDescription(tire.getProductDescription());
		managedCustomer.setPurchasePrice(tire.getPurchasePrice());
		managedCustomer.setSize(tire.getSize());
		managedCustomer.setOriginCountryCode(tire.getOriginCountryCode());
//		em.getTransaction().begin();

//		em.getTransaction().commit();
		em.persist(managedCustomer);
		em.flush();
//		Boolean rest = !em.contains(tire);
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
