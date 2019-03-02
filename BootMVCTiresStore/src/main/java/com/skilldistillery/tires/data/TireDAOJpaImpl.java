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
	public Tire create(Tire tire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tire update(int id, Tire tire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tire> findAll() {
		List<Tire> tires = null;
		String sql = "SELECT tire FROM Tire tire";
		tires = em.createQuery(sql, Tire.class).getResultList();
		return tires;
	}

}
