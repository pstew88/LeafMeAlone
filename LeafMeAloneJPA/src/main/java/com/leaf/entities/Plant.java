package com.leaf.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Plant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean flowering;
	private String name;
	
	@OneToOne
	@JoinColumn(name ="climate_id")
	private Climate climate;

	@OneToOne
	@JoinColumn(name ="lighting_id")
	private Lighting lighting;
	
	@OneToOne
	@JoinColumn(name ="water_id")
	private Water water;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFlowering() {
		return flowering;
	}

	public void setFlowering(boolean flowering) {
		this.flowering = flowering;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Climate getClimate() {
		return climate;
	}

	public void setClimate(Climate climate) {
		this.climate = climate;
	}

	public Lighting getLighting() {
		return lighting;
	}

	public void setLighting(Lighting lighting) {
		this.lighting = lighting;
	}

	public Water getWater() {
		return water;
	}

	public void setWater(Water water) {
		this.water = water;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plant [id=" + id + ", flowering=" + flowering + ", name=" + name + ", climate=" + climate
				+ ", lighting=" + lighting + ", water=" + water + "]";
	}

	public Plant(int id, boolean flowering, String name, Climate climate, Lighting lighting, Water water) {
		super();
		this.id = id;
		this.flowering = flowering;
		this.name = name;
		this.climate = climate;
		this.lighting = lighting;
		this.water = water;
	}

	public Plant() {
		super();
	}

	
	
}
