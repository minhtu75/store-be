package com.model.store.product;

import java.util.Date;

import lombok.Data;

@Data
public class ProductResponse {
	
	private Integer id;
	private String name;
	private String model;
	private Date createDate;
	private Date updateDate;
}
