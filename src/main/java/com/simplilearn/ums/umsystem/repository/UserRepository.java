package com.simplilearn.ums.umsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.ums.umsystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
