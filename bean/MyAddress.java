package com.cg.capstore.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class MyAddress 
{
	@Id
	@Column(name="mobileNo",length=10)
	private String mobileNo;
	@Column(name="pincode",length=6)
	private String pincode;
	@Column(name="houseNo",length=10)
	private String houseNo;
	@Column(name="area",length=20)
	private String area;
	@Column(name="city",length=20)
	private String city;
	@Column(name="state",length=30)
	private String state;
	@Column(name="landmark",length=50)
	private String landmark;
	@Column(name="name",length=50)
	private String name;
	@Column(name="alternate_mob",length=10)
	private String alternateMobileNo;
	@Enumerated(EnumType.STRING)
	private AddressType adressType;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customerAdd;
	
	public MyAddress()
	{
		super();
	}

	public MyAddress(String mobileNo, String pincode, String houseNo, String area, String city, String state,
			String landmark, String name, String alternateMobileNo, AddressType adressType) 
	{
		super();
		this.mobileNo = mobileNo;
		this.pincode = pincode;
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.landmark = landmark;
		this.name = name;
		this.alternateMobileNo = alternateMobileNo;
		this.adressType = adressType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternateMobileNo() {
		return alternateMobileNo;
	}

	public void setAlternateMobileNo(String alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}

	public AddressType getAdressType() {
		return adressType;
	}

	public void setAdressType(AddressType adressType) {
		this.adressType = adressType;
	}

	@Override
	public String toString() {
		return "Address [mobileNo=" + mobileNo + ", pincode=" + pincode + ", houseNo=" + houseNo + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", landmark=" + landmark + ", name=" + name
				+ ", alternateMobileNo=" + alternateMobileNo + ", adressType=" + adressType + "]";
	}
	
	
	
	
}
