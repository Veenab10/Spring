package com.xworkz.country.controller;


import com.xworkz.country.dto.PMDto;
import com.xworkz.country.dto.PMSearchDto;
import com.xworkz.country.model.service.PMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class PMController {
    @Autowired
    private PMService pmService;

    public PMController()
    {
        System.out.println("Created PMController");
    }

    @PostMapping("/submit")
    public String submit(@Valid PMDto pmDto, Model model)
    {
        System.out.println("submit method running in PMController ");
        System.out.println("PMDto Details"+pmDto);
        boolean saved=pmService.saveAndValidate(pmDto);
        if(saved)
        {
            System.out.println("saved service in controller"+pmDto);
        }
        else {
            System.out.println("not saved service in controller"+pmDto);
        }
        return "PM";
    }

    @PostMapping("/search2")
    public String search(@Valid PMSearchDto pmSearchDto, Model model)
    {
        System.out.println("Running search method in ContactController");
        System.out.println(pmSearchDto);
        List<PMDto> list =pmService.search(pmSearchDto);
        if(!list.isEmpty())
        {
            System.out.println("search in controller success"+pmSearchDto);
        }
        else {
            System.out.println("search in controller not success"+pmSearchDto);
        }
        model.addAttribute("pmName",pmSearchDto.getCountryName());
        model.addAttribute("listOfPmName",list);
        return "PMSearch";
    }

}
