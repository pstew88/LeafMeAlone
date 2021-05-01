package com.leaf.entities;

import javax.persistence.Entity;

@Entity
public class Plant {
private int id;
private String water;
private String light;
private Boolean flowering;
private String climate;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getWater() {
	return water;
}
public void setWater(String water) {
	this.water = water;
}
public String getLight() {
	return light;
}
public void setLight(String light) {
	this.light = light;
}
public Boolean getFlowering() {
	return flowering;
}
public void setFlowering(Boolean flowering) {
	this.flowering = flowering;
}
public String getClimate() {
	return climate;
}
public void setClimate(String climate) {
	this.climate = climate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((climate == null) ? 0 : climate.hashCode());
	result = prime * result + ((flowering == null) ? 0 : flowering.hashCode());
	result = prime * result + id;
	result = prime * result + ((light == null) ? 0 : light.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	Plant other = (Plant) obj;
	if (climate == null) {
		if (other.climate != null)
			return false;
	} else if (!climate.equals(other.climate))
		return false;
	if (flowering == null) {
		if (other.flowering != null)
			return false;
	} else if (!flowering.equals(other.flowering))
		return false;
	if (id != other.id)
		return false;
	if (light == null) {
		if (other.light != null)
			return false;
	} else if (!light.equals(other.light))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
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
	return "Plant [id=" + id + ", water=" + water + ", light=" + light + ", flowering=" + flowering + ", climate="
			+ climate + ", name=" + name + "]";
}
public Plant(int id, String water, String light, Boolean flowering, String climate, String name) {
	super();
	this.id = id;
	this.water = water;
	this.light = light;
	this.flowering = flowering;
	this.climate = climate;
	this.name = name;
}
public Plant() {
	super();
}


}
