package com.cg.capstore.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="merchant")
public class Merchant 
{
	@Id
	@Column(name="merId")
	private long merchantId;
	@Column(name="merName",length=50)
	private String merchantName;
	@Enumerated(EnumType.STRING)
	private MerchantType merType;
	@Column(name="email",length=70)
	private String email;
	@Column(name="mobile",length=10)
	private String mobile;
	@Column(name="password",length=20)
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	private MyAddress merchantAddress;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="merchant")
	private List<Product> products;
	public Merchant() 
	{
		super();
	}
	
	public Merchant(long merchantId, String merchantName, MerchantType merType, String email, String mobile,
			String password, MyAddress merchantAddress, List<Product> products) {
		super();
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.merType = merType;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.merchantAddress = merchantAddress;
		this.products = products;
	}
	
	public long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public MerchantType getMerType() {
		return merType;
	}
	public void setMerType(MerchantType merType) {
		this.merType = merType;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MyAddress getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(MyAddress merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", merchantName=" + merchantName + ", merType=" + merType
				+ ", email=" + email + ", mobile=" + mobile + ", password=" + password + ", merchantAddress="
				+ merchantAddress + ", products=" + products + "]";
	}
 	
	
	
}
