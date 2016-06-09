package com.vivek.ecomm.shoppingcart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the shopping_cart database table.
 * 
 */
@Entity
@Table(name = "shopping_cart")
@NamedQuery(name = "ShoppingCart.findAll", query = "SELECT s FROM ShoppingCart s")
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shopping_cart_id")
	private Integer shoppingCartId;

	@Column(name = "customer_id")
	private Integer customerId;

	@Column(name = "item_id")
	private Integer itemId;

	private Integer quantity;

	public ShoppingCart() {
	}

	public Integer getShoppingCartId() {
		return this.shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}