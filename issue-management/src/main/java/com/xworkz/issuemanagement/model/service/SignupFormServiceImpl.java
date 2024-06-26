package com.xworkz.issuemanagement.model.service;

import com.xworkz.issuemanagement.dto.SignupFormDto;
import com.xworkz.issuemanagement.model.repo.SignupFormRepo;
import com.xworkz.issuemanagement.util.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SignupFormServiceImpl implements SignupFormService {

    @Autowired
    private SignupFormRepo signupFormRepo;

    public SignupFormServiceImpl()
    {
        System.out.println("created SignupFormServiceImpl");
    }


    @Override
    public boolean saveAndValidate(SignupFormDto signupFormDto) {
        System.out.println("Running saved method in SignupFormServiceImpl...");

        String createdBy = "veena"; // or get the current user
        LocalDateTime createdOn = LocalDateTime.now();
        String updatedBy = "NA"; // or get the current user
        LocalDateTime updatedOn = null;
        boolean isActive = true;

        // Generate and set the password
        String generatedPassword = PasswordGenerator.generatePassword();
        signupFormDto.setPassword(generatedPassword);

        setAudit(signupFormDto, createdBy, createdOn, updatedBy, updatedOn, isActive);
        boolean res=signupFormRepo.save(signupFormDto);

        if(res)
        {
            System.out.println("saved repo in service"+signupFormDto);
        }
        else {
            System.out.println("not saved in service"+signupFormDto);
        }
        return true;
    }

    @Override
    public void setAudit(SignupFormDto signupFormDto, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, boolean isActive) {
        System.out.println("Running setAudit method....");
        signupFormDto.setCreatedBy(createdBy);
        signupFormDto.setCreatedOn(createdOn);
        signupFormDto.setUpdatedBy(updatedBy);
        signupFormDto.setUpdatedOn(updatedOn);
        signupFormDto.setActive(isActive);
    }

    @Override
    public SignupFormDto findByEmailAndPassword(String email, String password) {
        return signupFormRepo.findByEmailAndPassword( email, password);
    }
}
