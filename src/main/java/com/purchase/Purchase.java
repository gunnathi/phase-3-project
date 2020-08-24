package com.purchase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.customers.Customers;
import com.products.Products;


@Entity
@Table
public class Purchase {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int PurchaseId;
	private String purchaseDate;
	@OneToOne
	private Products products;
	@OneToOne
	private Customers customers;
	public int getPurchaseId() {
		return PurchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		PurchaseId = purchaseId;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public Purchase(String purchaseDate, Products products, Customers customers) {
		super();
		this.purchaseDate = purchaseDate;
		this.products = products;
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Purchase [PurchaseId=" + PurchaseId + ", purchaseDate=" + purchaseDate + ", products=" + products
				+ ", customers=" + customers + "]";
	}
}