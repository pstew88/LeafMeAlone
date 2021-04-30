package com.leaf.entities;

import javax.persistence.Entity;

@Entity
public class Subscription {
private int id;
private int numberOfPlants;
private String name;
private String climate;
private String water;
private boolean flowering;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumberOfPlants() {
	return numberOfPlants;
}
public void setNumberOfPlants(int numberOfPlants) {
	this.numberOfPlants = numberOfPlants;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClimate() {
	return climate;
}
public void setClimate(String climate) {
	this.climate = climate;
}
public String getWater() {
	return water;
}
public void setWater(String water) {
	this.water = water;
}
public boolean isFlowering() {
	return flowering;
}
public void setFlowering(boolean flowering) {
	this.flowering = flowering;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((climate == null) ? 0 : climate.hashCode());
	result = prime * result + (flowering ? 1231 : 1237);
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + numberOfPlants;
	result = prime * result + ((water == null) ? 0 : water.hashCode());
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
	Subscription other = (Subscription) obj;
	if (climate == null) {
		if (other.climate != null)
			return false;
	} else if (!climate.equals(other.climate))
		return false;
	if (flowering != other.flowering)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (numberOfPlants != other.numberOfPlants)
		return false;
	if (water == null) {
		if (other.water != null)
			return false;
	} else if (!water.equals(other.water))
		return false;
	return true;
}
@Override
public String toString() {
	return "Subscription [id=" + id + ", numberOfPlants=" + numberOfPlants + ", name=" + name + ", climate=" + climate
			+ ", water=" + water + ", flowering=" + flowering + "]";
}
public Subscription(int id, int numberOfPlants, String name, String climate, String water, boolean flowering) {
	super();
	this.id = id;
	this.numberOfPlants = numberOfPlants;
	this.name = name;
	this.climate = climate;
	this.water = water;
	this.flowering = flowering;
}
public Subscription() {
	super();
}

}
