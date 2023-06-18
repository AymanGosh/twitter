package com.twitter.twitterapi.service;

import com.twitter.twitterapi.model.user.User;
import com.twitter.twitterapi.payload.ApiResponse;
import com.twitter.twitterapi.payload.InfoRequest;
import com.twitter.twitterapi.payload.UserIdentityAvailability;
import com.twitter.twitterapi.payload.UserProfile;
import com.twitter.twitterapi.payload.UserSummary;
import com.twitter.twitterapi.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}