package com.leaf.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "number_plants")
	private int numberOfPlants;
	
	@Column(name = "shipment_date")
	private LocalDateTime shipmentDate;

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

	public LocalDateTime getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDateTime shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + numberOfPlants;
		result = prime * result + ((shipmentDate == null) ? 0 : shipmentDate.hashCode());
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
		Shipment other = (Shipment) obj;
		if (id != other.id)
			return false;
		if (numberOfPlants != other.numberOfPlants)
			return false;
		if (shipmentDate == null) {
			if (other.shipmentDate != null)
				return false;
		} else if (!shipmentDate.equals(other.shipmentDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shipment [id=" + id + ", numberOfPlants=" + numberOfPlants + ", shipmentDate=" + shipmentDate + "]";
	}

	public Shipment(int id, int numberOfPlants, LocalDateTime shipmentDate) {
		super();
		this.id = id;
		this.numberOfPlants = numberOfPlants;
		this.shipmentDate = shipmentDate;
	}

	public Shipment() {
		super();
	}
}
