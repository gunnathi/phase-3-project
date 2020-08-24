package com.products;





import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.purchase.Purchase;


@Entity
@Table
public class Products {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private int ProductId;
private String Category;
private String colour;
private String ProductName;
private int size;
private int price;


public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public Products(String category, String colour, String productName, int size, int price) {
	super();
	Category = category;
	this.colour = colour;
	ProductName = productName;
	this.size = size;
	this.price = price;
}


@Override
public String toString() {
	return "Products [ProductId=" + ProductId + ", Category=" + Category + ", colour=" + colour + ", ProductName="
			+ ProductName + ", size=" + size + ", price=" + price + "]";
}




}