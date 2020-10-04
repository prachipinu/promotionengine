package com.promotionengine.promotionengine.DTO;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromotionengineDTO {
	
	public List<String> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<String> ordersList) {
		this.ordersList = ordersList;
	}
	@JsonProperty("ordersList")
	private List<String> ordersList = new ArrayList<String>();
	
	

}
