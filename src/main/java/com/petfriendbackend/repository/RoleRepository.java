package com.petfriendbackend.repository;

import com.petfriendbackend.model.User;
import com.petfriendbackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);


    }

