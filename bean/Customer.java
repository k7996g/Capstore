package com.cg.capstore.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer
{
	@Id
	@Column(name="mobileNo",length=10)
	private String mobile;
	@Column(name="name",length=50)
	private String name;
	@Column(name="email",length=70)
	private String email;
	@Column(name="gender",length=6)
	private String gender;
	@Column(name="dob",length=20)
	private Date Dob;
	
	@OneToMany(mappedBy="customerAdd",cascade=CascadeType.ALL)
	private List<MyAddress> MyAddress = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private MyWishList wishlist;
	
	@OneToOne(cascade=CascadeType.ALL)
	private MyCart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	private SavedCardDetails cardDetail;
	
	@OneToMany(mappedBy="customerOrd",cascade=CascadeType.ALL)
	private List<MyOrders> myOrders;
	
	@Column(name="active",length=5)
	private boolean active;
	
	public Customer()
	{
		super();
	}

	public Customer(String name, String email, String mobile, String gender, Date dob, List<MyAddress> MyAddress,MyWishList wishlist, MyCart cart, SavedCardDetails cardDetail, List<MyOrders> myOrders, boolean active) 
	{
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		Dob = dob;
		this.MyAddress = MyAddress;
		this.wishlist = wishlist;
		this.cart = cart;
		this.cardDetail = cardDetail;
		this.myOrders = myOrders;
		this.active = active;
	}


	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public List<MyAddress> getMyAddress() {
		return MyAddress;
	}
	public void setMyAddress(List<MyAddress> MyAddress) {
		this.MyAddress = MyAddress;
	}
	public MyWishList getWishlist() {
		return wishlist;
	}
	public void setWishlist(MyWishList wishlist) {
		this.wishlist = wishlist;
	}
	public MyCart getCart() {
		return cart;
	}
	public void setCart(MyCart cart) {
		this.cart = cart;
	}
	public SavedCardDetails getCardDetail() {
		return cardDetail;
	}
	public void setCardDetail(SavedCardDetails cardDetail) {
		this.cardDetail = cardDetail;
	}
	public List<MyOrders> getMyOrders() {
		return myOrders;
	}
	public void setMyOrders(List<MyOrders> myOrders) {
		this.myOrders = myOrders;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() 
	{
		return "CustomerDetail [name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender + ", Dob="
				+ Dob + ", wishlist=" + wishlist + ", cart=" + cart + ", cardDetail=" + cardDetail + ", myOrders="
				+ myOrders + "]";
	}
	
	
}

