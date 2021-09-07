package com.revature.training.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity
@Table(name = "freshproducts")
@XmlRootElement
public class Product {

	@Id
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	
	
	
}
