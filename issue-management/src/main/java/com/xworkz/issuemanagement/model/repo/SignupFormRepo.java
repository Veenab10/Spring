package com.xworkz.issuemanagement.model.repo;

import com.xworkz.issuemanagement.dto.SignupFormDto;


public interface SignupFormRepo {

    boolean save(SignupFormDto signupFormDto);

    SignupFormDto findByEmailAndPassword(String email, String password);


}
