package com.xworkz.uniform.controller;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.dto.SearchDto;
import com.xworkz.uniform.model.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class SearchController {

    @Autowired
    private SearchService searchService;


    public SearchController()
    {
        System.out.println("Created SearchController");
    }

    @PostMapping("/search")
    public String search(@Valid SearchDto searchDto, Model model)
    {
        System.out.println("search method is running in searchcontroller");
        List<CollegeUniformDto> list=searchService.searchAndValidate(searchDto);
        if(!list.isEmpty())
        {
            System.out.println("search in controller success"+searchDto);
        }
        else {
            System.out.println("search in controller not success"+searchDto);
        }
        model.addAttribute("collegeName",searchDto.getCollegeName());
        model.addAttribute("listOfCollegeUniform",list);
        return "search";
    }
}
