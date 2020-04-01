package io.exiled.salesbook.controller;

import io.exiled.salesbook.model.PrintPreOrder;
import io.exiled.salesbook.service.AlpService;
import io.exiled.salesbook.service.LinkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableWebMvc
@Controller
public class PrintPreOrderController {

    private AlpService alpService;
    private LinkerService service;

    private String uploadPath = "/home/exile/dev/Photory/upd";
    private String defaultFolder = "/home/exile/dev/Photory/Linker/Tallinn Trophy";

    @Autowired
    public PrintPreOrderController(AlpService alpService, LinkerService service) {
        this.alpService = alpService;
        this.service = service;
    }

    @RequestMapping(path = "/preorder/{link1}")
    public String getFolders(
            @PathVariable("link1") String link1,
            Model model
    ) {
        model.addAttribute("folders", service.buildLinks("/" + link1));
        alpService.refresh();
        alpService.getPaths();
        alpService.makeCollection();
        model.addAttribute("alps", alpService.getAlps());
        return "linker";
    }
}
