package com.cg.capstore.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="images")
public class Image 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sno;
	@Column(name="url")
	private String url;
	@ManyToOne(cascade=CascadeType.ALL)
	private Product productImg;
	public Image()
	{
		super();
	}

	public Image(String url)
	{
		super();
		this.url = url;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url) 
	{
		this.url = url;
	}

	@Override
	public String toString()
	{
		return "Image [url=" + url + "]";
	}
	
	
}
