package com.example.registrationloginspringbootsecuritythymeleafhibernate.Repository;

import com.example.registrationloginspringbootsecuritythymeleafhibernate.MODEL.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
