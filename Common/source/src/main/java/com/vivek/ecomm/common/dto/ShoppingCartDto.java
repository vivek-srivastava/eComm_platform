package com.vivek.ecomm.common.dto;

import javax.validation.constraints.NotNull;

public class ShoppingCartDto {
	
	@NotNull
	private Integer customerId;
	@NotNull
	private Integer itemId;
	@NotNull
	private Integer quantity;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
