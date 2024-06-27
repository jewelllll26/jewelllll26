package com.kandahar.kctech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kandahar.kctech.Model.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
