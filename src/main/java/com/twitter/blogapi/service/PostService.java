package com.twitter.twitterapi.service;

import com.twitter.twitterapi.model.Post;
import com.twitter.twitterapi.payload.ApiResponse;
import com.twitter.twitterapi.payload.PagedResponse;
import com.twitter.twitterapi.payload.PostRequest;
import com.twitter.twitterapi.payload.PostResponse;
import com.twitter.twitterapi.security.UserPrincipal;

public interface PostService {

	PagedResponse<Post> getAllPosts(int page, int size);

	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);

	PagedResponse<Post> getPostsByCategory(Long id, int page, int size);

	PagedResponse<Post> getPostsByTag(Long id, int page, int size);

	Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);

	ApiResponse deletePost(Long id, UserPrincipal currentUser);

	PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);

	Post getPost(Long id);

}
