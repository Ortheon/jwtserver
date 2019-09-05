package com.ortheon.jwtserver.service;

import com.ortheon.jwtserver.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

}
