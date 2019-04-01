package com.cg.capstore.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mycart")
public class MyCart
{
	@Id
	@Column(name="cartId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="mycart")
	private List<MyOrders> orders = new ArrayList<>();
	public MyCart() 
	{
		super();
	}
	
	public MyCart(int cartId, List<MyOrders> orders) 
	{
		super();
		this.cartId = cartId;
		this.orders = orders;
	}
	
	public int getCartId() 
	{
		return cartId;
	}
	public void setCartId(int cartId) 
	{
		this.cartId = cartId;
	}
	
	public List<MyOrders> getOrder() 
	{
		return orders;
	}

	public void setOrder(List<MyOrders> order) 
	{
		this.orders = order;
	}

	@Override
	public String toString() 
	{
		return "MyCart [cartId=" + cartId + ", productId_Quantity=" + orders + "]";
	}
	
	
	
}
