package com.cg.capstore.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="coupon")
public class Coupon
{	
	@Id
	@Column(name="couponId",length=10)
	private long couponId;
	@Column(name="couponCode",length=6)
	private String couponCode;
	@Column(name="description",length=50)
	private String description;
	@Column(name="applied",length=5)
	private boolean applied;
	@Column(name="expiryDate",length=50)
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	@ManyToOne(cascade=CascadeType.ALL)
	private Product prod_coupon;
	public Coupon() 
	{
		super();
	}

	public Coupon(long couponId, String couponCode, String description, boolean applied, Date expiryDate) 
	{
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.description = description;
		this.applied = applied;
		this.expiryDate = expiryDate;
	}

	public long getCouponId() {
		return couponId;
	}

	public void setCouponId(long couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isApplied() {
		return applied;
	}

	public void setApplied(boolean applied) {
		this.applied = applied;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", description=" + description
				+ ", applied=" + applied + ", expiryDate=" + expiryDate + "]";
	}

		
	
	

}

