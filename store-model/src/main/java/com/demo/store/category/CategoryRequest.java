package com.demo.store.category;

import java.util.Date;

import lombok.Data;

@Data
public class CategoryRequest {
	private String name;
	
	private String url;
	
	private String externalId;
	
	private String description;
	
	private String longDescription;

	private Date activeStartDate;

	private Date activeEndDate;
}
