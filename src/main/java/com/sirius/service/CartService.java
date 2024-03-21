package com.sirius.service;

import com.sirius.exception.ProductException;
import com.sirius.model.Cart;
import com.sirius.model.User;
import com.sirius.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
