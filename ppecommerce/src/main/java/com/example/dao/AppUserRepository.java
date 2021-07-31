package com.example.dao;

import com.example.entities.AppUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AppUserRepository extends JpaRepository<AppUser,Integer> {

    @Query("select user  from AppUser user where user.username like :x ")
    public AppUser findByUsername(@Param("x") String username);

    @Query("select user  from AppUser user where user.username like %:x ")
    public Page<AppUser> listUsersPage(@Param("x") String username, Pageable pageable);

}