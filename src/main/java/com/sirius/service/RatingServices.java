package com.sirius.service;

import java.util.List;

import com.sirius.exception.ProductException;
import com.sirius.model.Rating;
import com.sirius.model.User;
import com.sirius.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
