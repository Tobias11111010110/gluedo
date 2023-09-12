package com.bbw.tkl.zkb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Controler {
    @GetMapping("/")
    public String addEntry(Model model) throws java.text.ParseException{
        List<Person> people = PersonService.personList;
        List<Weapon> weapons = WeaponService.weaponList;
        model.addAttribute("people", people);
        model.addAttribute("weapons", weapons);
        return "punchlistview";
    }




}
