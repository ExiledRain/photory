package io.exiled.salesbook.controller;

import io.exiled.salesbook.service.LinkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/linker")
public class LinkerController {
    @Autowired
    private LinkerService service;
//
//    @Value("${photory.path}")
//    private String defaultFolder;

    @RequestMapping
    public String baseLinker(Model model) {
        model.addAttribute("folders",service.buildLinks(""));
        return "linker";
    }

    @RequestMapping("/{link1}")
    public String getFolders(
            Model model,
            @PathVariable String link1
    ){
        model.addAttribute("folders",service.buildLinks("/" + link1));
        return "linker";
    }

    @RequestMapping("/{link1}/{link2}")
    public String get2Folders(
            Model model,
            @PathVariable String link1,
            @PathVariable String link2
    ) {
        model.addAttribute("folders",service.buildLinks("/"+ link1 + "/" + link2));
        return "linker";
    }
    @RequestMapping("/{link1}/{link2}/{link3}")
    public String get3Folders(
            Model model,
            @PathVariable String link1,
            @PathVariable String link2,
            @PathVariable String link3
    ) {
        model.addAttribute("folders",service.buildLinks("/"+ link1 + "/" + link2 + "/" + link3));
        return "linker";
    }
    @RequestMapping("/{link1}/{link2}/{link3}/{link4}")
    public String get4Folders(
            Model model,
            @PathVariable String link1,
            @PathVariable String link2,
            @PathVariable String link3,
            @PathVariable String link4
    ) {
        model.addAttribute("folders",service.buildLinks("/"+ link1 + "/" + link2 + "/" + link3 + "/" + link4));
        return "linker";
    }
}


















