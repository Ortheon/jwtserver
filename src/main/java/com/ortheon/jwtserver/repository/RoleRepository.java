package com.ortheon.jwtserver.repository;

import com.ortheon.jwtserver.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
