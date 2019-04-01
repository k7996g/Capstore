package com.cg.capstore.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback
{
	@Id
	@Column(name="feedId",length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long feedbackId;
	@Column(name="desc")
	private String description;
	@OneToOne(cascade=CascadeType.ALL)
	private Product product;

	public Feedback() 
	{
		super();
	}

	public Feedback(long feedbackId, String description, Product product)
	{
		super();
		this.feedbackId = feedbackId;
		this.description = description;
		this.product = product;
	}

	public long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() 
	{
		return product;
	}

	public void setProduct(Product product) 
	{
		this.product = product;
	}

	@Override
	public String toString() 
	{
		return "Feedback [feedbackId=" + feedbackId + ", description=" + description + ", product=" + product + "]";
	}
}
