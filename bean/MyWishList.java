package com.cg.capstore.bean;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mywishlist")
public class MyWishList 
{
	@Id
	@Column(name="wishid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int wishId;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="wishlist")
	private List<Product> product;
	
	public MyWishList()
	{
		super();
	}
	
	public MyWishList(int wishId, List<Product> productId)
	{
		super();
		this.wishId = wishId;
		this.product = productId;
	}
	
	public int getWishId() {
		return wishId;
	}
	public void setWishId(int wishId) {
		this.wishId = wishId;
	}
	public List<Product> getProductId() {
		return product;
	}
	public void setProductId(List<Product> productId) {
		this.product = productId;
	}
	
	
	@Override
	public String toString() {
		return "MyWishList [wishId=" + wishId + ", productId=" + product + "]";
	}
	
	

}
