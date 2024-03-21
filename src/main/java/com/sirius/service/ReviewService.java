package com.sirius.service;

import java.util.List;

import com.sirius.exception.ProductException;
import com.sirius.model.Review;
import com.sirius.model.User;
import com.sirius.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
