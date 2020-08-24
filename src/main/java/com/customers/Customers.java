package com.customers;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;






@Table
@Entity
public class Customers {
	
@GeneratedValue(strategy = GenerationType.AUTO)
@Id

private int customerId;
private String customerName;
private String cusEmailId;
private String cusPhoneNum;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCusEmailId() {
	return cusEmailId;
}
public void setCusEmailId(String cusEmailId) {
	this.cusEmailId = cusEmailId;
}
public String getCusPhoneNum() {
	return cusPhoneNum;
}
public void setCusPhoneNum(String cusPhoneNum) {
	this.cusPhoneNum = cusPhoneNum;
}

public Customers(String customerName, String cusPhoneNum,String cusEmailId) {
	super();
	this.customerName = customerName;
	this.cusEmailId = cusEmailId;
	this.cusPhoneNum = cusPhoneNum;
}
@Override
public String toString() {
	return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", cusEmailId=" + cusEmailId
			+ ", cusPhoneNum=" + cusPhoneNum + "]";
}



}

 