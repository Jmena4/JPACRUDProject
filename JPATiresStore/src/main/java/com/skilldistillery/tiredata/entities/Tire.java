package com.skilldistillery.tiredata.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@Column(name = "manufactured_date")
	private Date manufacturedDate;

	private Double size;

	@Column(name = "purchase_price")
	private double purchasePrice;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "origin_country_code")
	private String originCountryCode;

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

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getOriginCountryCode() {
		return originCountryCode;
	}

	public void setOriginCountryCode(String originCountryCode) {
		this.originCountryCode = originCountryCode;
	}

	@Override
	public String toString() {
		return "Tire [id=" + id + ", name=" + name + ", manufacturedDate=" + manufacturedDate + ", size=" + size
				+ ", purchasePrice=" + purchasePrice + ", productDescription=" + productDescription
				+ ", originCountryCode=" + originCountryCode + "]";
	}

	public Tire() {
	}

	

	public Tire(String name, Date manufacturedDate, Double size, double purchasePrice, String productDescription,
			String originCountryCode) {
		super();
		this.name = name;
		this.manufacturedDate = manufacturedDate;
		this.size = size;
		this.purchasePrice = purchasePrice;
		this.productDescription = productDescription;
		this.originCountryCode = originCountryCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((manufacturedDate == null) ? 0 : manufacturedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((originCountryCode == null) ? 0 : originCountryCode.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		long temp;
		temp = Double.doubleToLongBits(purchasePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Tire other = (Tire) obj;
		if (id != other.id)
			return false;
		if (manufacturedDate == null) {
			if (other.manufacturedDate != null)
				return false;
		} else if (!manufacturedDate.equals(other.manufacturedDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (originCountryCode == null) {
			if (other.originCountryCode != null)
				return false;
		} else if (!originCountryCode.equals(other.originCountryCode))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (Double.doubleToLongBits(purchasePrice) != Double.doubleToLongBits(other.purchasePrice))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

}
