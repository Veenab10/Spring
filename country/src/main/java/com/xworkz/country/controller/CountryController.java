package com.xworkz.country.controller;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.CountrySearchDto;
import com.xworkz.country.model.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping()
public class CountryController {

    @Autowired
    private CountryService countryService;

    public CountryController()
    {
        System.out.println("Created CountryController");
    }

    @PostMapping("/save")
    public String save(@Valid CountryDto countryDto, Model model)
    {
        System.out.println("Ruuning save method in CountryController"+countryDto);
        System.out.println(countryDto);
        boolean saved=countryService.saveAndValidate(countryDto);
        if(saved)
        {
            System.out.println("saved service in contoller"+countryDto);
        }
        else {
            System.out.println("not saved service in contoller"+countryDto);
        }
        return "Country";


    }

    @PostMapping("/search")
    public String search(@Valid CountrySearchDto countrySearchDto, Model model)
    {
        System.out.println("search method is running in searchcontroller");
        List<CountryDto> list=countryService.search(countrySearchDto);
        if(!list.isEmpty())
        {
            System.out.println("search in controller success"+countrySearchDto);
        }
        else {
            System.out.println("search in controller not success"+countrySearchDto);
        }
        model.addAttribute("countryName",countrySearchDto.getName());
        model.addAttribute("listOfCountryName",list);
        return "CountrySearch";
    }

@GetMapping("/country-edit")
    public String onEdit(@RequestParam int pk,Model model)
    {
        System.out.println("running on edit in Country controller.. for pk : "+pk);
        CountryDto countryDto=countryService.findById(pk);
        if(countryDto!=null)
        {
            System.out.println("search in controller success"+countryDto);
            model.addAttribute("countryDto",countryDto);

        }
        else {
            System.out.println("search in controller not  success");
        }

        return "Country";
    }

}
