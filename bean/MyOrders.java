package com.cg.capstore.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="myorders")
public class MyOrders
{
	@Id
	@Column(name="orderId",length=10)
	private long orderId;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="myorders")
	private List<Product> product  = new ArrayList<>();
	
	@Column(name="purchaseDate",length=50)
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	@OneToOne(cascade=CascadeType.ALL)
	private MyAddress deliveryAddress;
	@Column(name="deliverdate",length=50)
	@Temporal(TemporalType.DATE)
	private Date DeliveryDate;
	@OneToOne(cascade=CascadeType.ALL)
	private  Invoice  invoice;	
	@Column(name="status",length=20)
	private String orderStatus;
	@Column(name="subtotal",length=10)
	private Double subTotal;
	@ManyToOne(cascade=CascadeType.ALL)
	private MyCart mycart;
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customerOrd;
	
	public MyOrders() 
	{
		super();
	}
	
	
	
	public MyOrders(long orderId, List<Product> product, Date purchaseDate, MyAddress deliveryAddress,
			Date deliveryDate, Invoice invoice, String orderStatus, Double subTotal, Customer customerOrd) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.purchaseDate = purchaseDate;
		this.deliveryAddress = deliveryAddress;
		DeliveryDate = deliveryDate;
		this.invoice = invoice;
		this.orderStatus = orderStatus;
		this.subTotal = subTotal;
		this.customerOrd = customerOrd;
	}



	public long getorderId() {
		return orderId;
	}
	public void setorderId(long orderId) {
		this.orderId = orderId;
	}
	
	
	
	
	public List<Product> getProduct() {
		return product;
	}



	public void setProduct(List<Product> product) {
		this.product = product;
	}



	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public MyAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(MyAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public Date getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public Invoice getTransDetails() {
		return invoice;
	}
	public void setTransDetails(Invoice transDetails) {
		this.invoice = transDetails;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}



	@Override
	public String toString() {
		return "MyOrders [orderId=" + orderId + ", product=" + product + ", purchaseDate=" + purchaseDate
				+ ", deliveryAddress=" + deliveryAddress + ", DeliveryDate=" + DeliveryDate + ", invoice=" + invoice
				+ ", orderStatus=" + orderStatus + ", subTotal=" + subTotal + ", customerOrd=" + customerOrd + "]";
	}
	
	
	
	
	
	
}
