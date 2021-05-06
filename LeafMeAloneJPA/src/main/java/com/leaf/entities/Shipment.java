package com.leaf.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "number_plants")
	private int numberOfPlants;

	@Column(name = "shipment_date")
	private LocalDateTime shipmentDate;

	@OneToOne
	@JoinColumn(name = "subscription_id")
	private Subscription subscription;

	@ManyToMany
	@JoinTable(name = "Shipment_has_Plant", joinColumns = @JoinColumn(name = "Shipment_id"), inverseJoinColumns = @JoinColumn(name = "Plant_id"))
	private List<Plant> shipmentPlants;

	@ManyToMany
	@JoinTable(name = "Subscription_has_Plant", joinColumns = @JoinColumn(name = "Subscription_id"), inverseJoinColumns = @JoinColumn(name = "Plant_id"))
	private List<Plant> subscriptionPlants;

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

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public List<Plant> getShipmentPlants() {
		return shipmentPlants;
	}

	public void setShipmentPlants(List<Plant> shipmentPlants) {
		this.shipmentPlants = shipmentPlants;
	}

	public List<Plant> getSubscriptionPlants() {
		return subscriptionPlants;
	}

	public void setSubscriptionPlants(List<Plant> subscriptionPlants) {
		this.subscriptionPlants = subscriptionPlants;
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
		Shipment other = (Shipment) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shipment [id=" + id + ", numberOfPlants=" + numberOfPlants + ", shipmentDate=" + shipmentDate
				+ ", subscription=" + subscription + ", shipmentPlants=" + shipmentPlants + ", subscriptionPlants="
				+ subscriptionPlants + "]";
	}

	public Shipment(int id, int numberOfPlants, LocalDateTime shipmentDate, Subscription subscription,
			List<Plant> shipmentPlants, List<Plant> subscriptionPlants) {
		super();
		this.id = id;
		this.numberOfPlants = numberOfPlants;
		this.shipmentDate = shipmentDate;
		this.subscription = subscription;
		this.shipmentPlants = shipmentPlants;
		this.subscriptionPlants = subscriptionPlants;
	}

	public Shipment() {
		super();
	}
	
}
