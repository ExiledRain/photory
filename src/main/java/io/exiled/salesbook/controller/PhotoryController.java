package io.exiled.salesbook.controller;

import io.exiled.salesbook.service.PhotoryService;
import io.exiled.salesbook.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoryController {
    @Autowired
    private PhotoryService photoryService;
    @Autowired
    private TestService service;

//    @Value("${photory.path}")
//    private String defaultFolder;

    String root = "/home/exile/dev/Photory/Tallinn Trophy";

    @GetMapping("/phot")
    public String getLinks(Model model) {
        photoryService.buildPaths();
        model.addAttribute("photories",photoryService.getLinks());

        return "photory";
    }

    @GetMapping("/test")
    public String test() {
        service.test();
        return "test";
    }
}
























