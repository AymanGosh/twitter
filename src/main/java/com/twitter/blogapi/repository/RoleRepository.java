package com.twitter.twitterapi.repository;

import com.twitter.twitterapi.model.role.Role;
import com.twitter.twitterapi.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
