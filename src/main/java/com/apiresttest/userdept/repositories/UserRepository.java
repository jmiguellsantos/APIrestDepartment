package com.apiresttest.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiresttest.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
