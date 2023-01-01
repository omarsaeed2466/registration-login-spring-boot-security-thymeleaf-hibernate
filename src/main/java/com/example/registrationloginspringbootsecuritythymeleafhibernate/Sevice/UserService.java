package com.example.registrationloginspringbootsecuritythymeleafhibernate.Sevice;
import com.example.registrationloginspringbootsecuritythymeleafhibernate.MODEL.User;
import com.example.registrationloginspringbootsecuritythymeleafhibernate.Web.DTO.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
public interface UserService extends  UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}
