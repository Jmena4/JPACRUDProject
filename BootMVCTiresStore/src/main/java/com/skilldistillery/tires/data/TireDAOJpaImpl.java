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

	@Override
	public Tire create(Tire tire) {
		em.persist(tire);
		em.flush();
//		Boolean test = !em.contains(tire);
		return tire;
	}

	@Override
	public Tire update(int id, Tire tire) {
		Tire managedTire = em.find(Tire.class, id);
		managedTire.setManufacturedDate(tire.getManufacturedDate());
		System.out.println("*************" + tire);
		managedTire.setName(tire.getName());
		managedTire.setProductDescription(tire.getProductDescription());
		managedTire.setPurchasePrice(tire.getPurchasePrice());
		managedTire.setSize(tire.getSize());
		managedTire.setOriginCountryCode(tire.getOriginCountryCode());
		System.out.println(managedTire);
//		em.persist(managedCustomer);
		em.flush();
//		Boolean rest = !em.contains(tire);
		return managedTire;
	}

	@Override
	public Boolean delete(int id) {
		Tire tire = em.find(Tire.class, id);
		em.remove(tire);
		Boolean test = !em.contains(tire);
		return test;
	}

}
