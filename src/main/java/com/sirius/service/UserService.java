package com.sirius.service;

import com.sirius.exception.UserException;
import com.sirius.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
