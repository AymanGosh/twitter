package com.twitter.twitterapi.service;

import com.twitter.twitterapi.exception.UnauthorizedException;
import com.twitter.twitterapi.model.Category;
import com.twitter.twitterapi.payload.ApiResponse;
import com.twitter.twitterapi.payload.PagedResponse;
import com.twitter.twitterapi.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

	PagedResponse<Category> getAllCategories(int page, int size);

	ResponseEntity<Category> getCategory(Long id);

	ResponseEntity<Category> addCategory(Category category, UserPrincipal currentUser);

	ResponseEntity<Category> updateCategory(Long id, Category newCategory, UserPrincipal currentUser)
			throws UnauthorizedException;

	ResponseEntity<ApiResponse> deleteCategory(Long id, UserPrincipal currentUser) throws UnauthorizedException;

}
