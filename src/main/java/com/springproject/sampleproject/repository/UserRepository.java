package com.springproject.sampleproject.repository;

import com.springproject.sampleproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {

}
