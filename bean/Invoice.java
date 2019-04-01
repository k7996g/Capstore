package com.cg.capstore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice
{
	@Id
	@Column(name="invoiceId")
	private long invoiceId;
	@Enumerated(EnumType.STRING)
	private PaymentMethods methods;
	@Column(name="tranId")
	private long transactionId;
	
	public Invoice() 
	{
		super();
	}
	
	public long getInvoiceId() 
	{
		return invoiceId;
	}



	public void setInvoiceId(long invoiceId)
	{
		this.invoiceId = invoiceId;
	}



	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public Invoice(long transactionId) {
		super();
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", transactionId=" + transactionId + "]";
	}
	
	
}
