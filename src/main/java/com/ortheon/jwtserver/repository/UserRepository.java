package com.ortheon.jwtserver.repository;

import com.ortheon.jwtserver.domain.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
