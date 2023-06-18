package com.twitter.twitterapi.service;

import com.twitter.twitterapi.model.Comment;
import com.twitter.twitterapi.payload.ApiResponse;
import com.twitter.twitterapi.payload.CommentRequest;
import com.twitter.twitterapi.payload.PagedResponse;
import com.twitter.twitterapi.security.UserPrincipal;

public interface CommentService {

	PagedResponse<Comment> getAllComments(Long postId, int page, int size);

	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);

	Comment getComment(Long postId, Long id);

	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);

	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);

}
