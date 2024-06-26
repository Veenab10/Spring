package com.xworkz.issuemanagement.model.service;

import com.xworkz.issuemanagement.dto.SignupFormDto;

import java.time.LocalDateTime;

public interface SignupFormService {

    boolean saveAndValidate (SignupFormDto signupFormDto);

    void setAudit(SignupFormDto signupFormDto, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, boolean isActive);

    SignupFormDto findByEmailAndPassword(String email, String password);
}
