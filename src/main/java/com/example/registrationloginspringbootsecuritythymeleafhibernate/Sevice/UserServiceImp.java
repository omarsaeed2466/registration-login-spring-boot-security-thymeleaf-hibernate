package com.example.registrationloginspringbootsecuritythymeleafhibernate.Sevice;

import com.example.registrationloginspringbootsecuritythymeleafhibernate.MODEL.Role;
import com.example.registrationloginspringbootsecuritythymeleafhibernate.MODEL.User;
import com.example.registrationloginspringbootsecuritythymeleafhibernate.Repository.UserRepository;
import com.example.registrationloginspringbootsecuritythymeleafhibernate.Web.DTO.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;
   // @Autowired
   // private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImp(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
    User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(),
            registrationDto.getPassword(),registrationDto.getEmail(), Arrays.asList(new Role("Role USer")));

    return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
