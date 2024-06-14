package com.xworkz.uniform.controller;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.model.service.CollegeUniformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping
public class CollegeUniformController {

    @Autowired
    private CollegeUniformService collegeUniformService;

    public CollegeUniformController()
    {
        System.out.println("Created CollegeUniformController");
    }

    @PostMapping("/send")
    public  String save(@Valid CollegeUniformDto collegeUniformDto, BindingResult bindingResult, Model model)
    {
        System.out.println("Running save method in CollegeUniformController ");
        System.out.println("Dto Details:"+collegeUniformDto);
        bindingResult
                .getAllErrors()
                .forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
        model.addAttribute("errors",bindingResult.getAllErrors());

        if(bindingResult.hasErrors())
        {
            System.out.println("dto has invalid data");
            model.addAttribute("dto",collegeUniformDto);
            return "collegeUniform";
        }
        else{

            boolean saved=collegeUniformService.saveAndValidate(collegeUniformDto);
            if(saved)
            {
                System.out.println("saved service in controller"+collegeUniformDto);
            }
            else {
                System.out.println(" not saved service in controller"+collegeUniformDto);
            }
        }

        model.addAttribute("name",collegeUniformDto.getName()+",Thanks for Registering");
        return "collegeUniformResult";

    }
}
