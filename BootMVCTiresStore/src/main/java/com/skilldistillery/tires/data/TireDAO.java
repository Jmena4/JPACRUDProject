package com.skilldistillery.tires.data;

import java.util.List;

import com.skilldistillery.tiredata.entities.Tire;

public interface TireDAO {
	public Tire findById(int id);

	public List<Tire> findAll();

	public Tire create(Tire tire);

	public Tire update(int id, Tire tire);

	public Boolean delete(int id);
}
