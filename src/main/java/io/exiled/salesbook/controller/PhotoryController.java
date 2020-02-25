package io.exiled.salesbook.controller;

import io.exiled.salesbook.service.PhotoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PhotoryController {
    @Autowired
    private PhotoryService photoryService;

    @Value("${photory.path}")
    private String pth;

    @GetMapping("/phot")
    public String getLinks(Model model) {
        photoryService.buildPaths();
        model.addAttribute("photories",photoryService.getLinks());

        return "photory";
    }
}
