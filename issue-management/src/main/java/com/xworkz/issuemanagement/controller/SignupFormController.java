package com.xworkz.issuemanagement.controller;

import com.xworkz.issuemanagement.dto.SignupFormDto;
import com.xworkz.issuemanagement.model.service.SignupFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class SignupFormController {

    @Autowired
    private SignupFormService signupFormService;

    public SignupFormController() {
        System.out.println("Created SignupFormController");
    }

    @PostMapping("signup")
    public String signup(@Valid SignupFormDto signupFormDto, Model model) {
        System.out.println("Running signup method...");
        System.out.println("Dto Details:" + signupFormDto);
        model.addAttribute("dto", signupFormDto);
        model.addAttribute("name", signupFormDto.getFname() + ",successfully Registered");

        boolean saved = signupFormService.saveAndValidate(signupFormDto);
        if (saved) {
            System.out.println("saved service in controller" + signupFormDto);
            return "SignInForm";
        } else {
            System.out.println("not saved in controller" + signupFormDto);
        }
        return "SignupForm";
    }

    @PostMapping("signin")
    public String signin(String email, String password, Model model) {
        System.out.println("Running signin method...");
        //System.out.println("Dto Details:" + signinFormDto);

        SignupFormDto signupFormDto = signupFormService.findByEmailAndPassword(email, password);
        if (signupFormDto != null) {
            model.addAttribute("message", "successfully logined with:" + signupFormDto.getEmail());
            return "SigninSuccessPage";
        } else {
            model.addAttribute("error", "Invalid email id and password");
            return "SignInForm";
        }

//        // Check if the user exists (simulation)
//        boolean userExists = "vijayalaxmibaligeri@gmail.com".equals(signinFormDto.getEmail()) && "e9oo*y%4K^sT".equals(signinFormDto.getPassword());
//
//        if (userExists) {
//            model.addAttribute("message", "Sign in successful with,"+signinFormDto.getEmail());
//            return "SigninSuccessPage"; // Redirect to success page or do further processing
//        } else {
//            model.addAttribute("error", "Invalid credentials");
//            return "SignInForm"; // Return to sign-in form with error message
//        }
//    }

    }
}
