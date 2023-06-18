package com.twitter.twitterapi.service;

import com.twitter.twitterapi.model.Album;
import com.twitter.twitterapi.payload.AlbumResponse;
import com.twitter.twitterapi.payload.ApiResponse;
import com.twitter.twitterapi.payload.PagedResponse;
import com.twitter.twitterapi.payload.request.AlbumRequest;
import com.twitter.twitterapi.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface AlbumService {

	PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

	ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser);

	ResponseEntity<Album> getAlbum(Long id);

	ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

	ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

	PagedResponse<Album> getUserAlbums(String username, int page, int size);

}
