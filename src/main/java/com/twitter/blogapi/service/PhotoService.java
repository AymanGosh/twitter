package com.twitter.twitterapi.service;

import com.twitter.twitterapi.payload.ApiResponse;
import com.twitter.twitterapi.payload.PagedResponse;
import com.twitter.twitterapi.payload.PhotoRequest;
import com.twitter.twitterapi.payload.PhotoResponse;
import com.twitter.twitterapi.security.UserPrincipal;

public interface PhotoService {

	PagedResponse<PhotoResponse> getAllPhotos(int page, int size);

	PhotoResponse getPhoto(Long id);

	PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest, UserPrincipal currentUser);

	PhotoResponse addPhoto(PhotoRequest photoRequest, UserPrincipal currentUser);

	ApiResponse deletePhoto(Long id, UserPrincipal currentUser);

	PagedResponse<PhotoResponse> getAllPhotosByAlbum(Long albumId, int page, int size);

}