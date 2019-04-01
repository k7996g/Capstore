package com.cg.capstore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "savedcard")
public class SavedCardDetails 
{
	@Id
	@Column(name="sno")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sno;
	@Column(name="card_holder_name",length=50)
	private String cardHolderName;
	@Column(name="cardno",length=16)
	private String CardNumber;
	@Column(name="expirymon",length=2)
	private  int expiryMonth;
	@Column(name="expiry_year",length=4)
	private int expiryYear;
	
	public SavedCardDetails() 
	{
		super();
	}	

	public SavedCardDetails(String cardHolderName, String cardNumber, int expiryMonth, int expiryYear) 
	{
		super();
		this.cardHolderName = cardHolderName;
		CardNumber = cardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	
	@Override
	public String toString() {
		return "SavedCardDetails [cardHolderName=" + cardHolderName + ", CardNumber=" + CardNumber + ", expiryMonth="
				+ expiryMonth + ", expiryYear=" + expiryYear + "]";
	}
	
	
	
}
