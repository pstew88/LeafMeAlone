package com.leaf.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private boolean flowering;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		result = prime * result + (flowering ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (flowering != other.flowering)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Subscription [id=" + id + ", name=" + name + ", flowering=" + flowering + "]";
	}
	public Subscription(int id, String name, boolean flowering) {
		super();
		this.id = id;
		this.name = name;
		this.flowering = flowering;
	}
	public Subscription() {
		super();
	}
}
