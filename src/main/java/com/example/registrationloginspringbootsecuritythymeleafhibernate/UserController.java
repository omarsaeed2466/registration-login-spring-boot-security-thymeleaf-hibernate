package com.example.registrationloginspringbootsecuritythymeleafhibernate;

import com.example.registrationloginspringbootsecuritythymeleafhibernate.Sevice.UserService;
import com.example.registrationloginspringbootsecuritythymeleafhibernate.Web.DTO.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
@RestController
public class UserController {
    private UserService userService ;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }


@PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        userService.save(registrationDto);
        return "redirect:/registration?success";
    }
}
