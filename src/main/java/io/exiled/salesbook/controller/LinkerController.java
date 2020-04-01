package io.exiled.salesbook.controller;

import io.exiled.salesbook.repos.SaleRepo;
import io.exiled.salesbook.service.AlpService;
import io.exiled.salesbook.service.LinkerService;
import io.exiled.salesbook.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/preorder")
public class LinkerController {
    private SaleRepo saleRepo;

    private AlpService alpService;
    private LinkerService service;


//    @Autowired
//    private TestService testService;

//    @Value("${upload.path}")
    private String uploadPath = "/home/exile/dev/Photory/upd";

//    @Value("${photory.path}")
    private String defaultFolder = "/home/exile/dev/Photory/Linker/Tallinn Trophy";

    String root = "/home/exile/dev/Photory/Tallinn Trophy";

//    @RequestMapping
//    public String baseLinker(Model model) {
//        model.addAttribute("folders", service.buildLinks(""));
//        alpService.refresh();
//        alpService.getPaths();
//        alpService.makeCollection();
//        model.addAttribute("alps", alpService.getAlps());
//        return "linker";
//    }

    @RequestMapping(path = "{link1}",method = RequestMethod.GET)
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

//    @RequestMapping("/{link1}/{link2}")
//    public String get2Folders(
//            @PathVariable("link1") String link1,
//            @PathVariable("link2") String link2,
//            Model model
//    ) {
//        model.addAttribute("folders", service.buildLinks("/" + link1 + "/" + link2));
//        alpService.refresh();
//        alpService.getPaths();
//        alpService.makeCollection();
//        model.addAttribute("alps", alpService.getAlps());
//        return "linker";
//    }

//    @RequestMapping("/{link1}/{link2}/{link3}")
//    public String get3Folders(
//            Model model,
//            @PathVariable("link1") String link1,
//            @PathVariable("link2") String link2,
//            @PathVariable("link3") String link3
//    ) {
//        model.addAttribute("folders", service.buildLinks("/" + link1 + "/" + link2 + "/" + link3));
//        alpService.refresh();
//        alpService.getPaths();
//        alpService.makeCollection();
//        model.addAttribute("alps", alpService.getAlps());
//        return "linker";
//    }

//    @RequestMapping(path = "/{link1}/{link2}/{link3}/{link4}")
//    public String get4Folders(
//            Model model,
//            @PathVariable("link1") String link1,
//            @PathVariable("link2") String link2,
//            @PathVariable("link3") String link3,
//            @PathVariable("link4") String link4
//    ) {
//        model.addAttribute("folders", service.buildLinks("/" + link1 + "/" + link2 + "/" + link3 + "/" + link4));
//        alpService.refresh();
//        alpService.getPaths();
//        alpService.makeCollection();
//        model.addAttribute("alps", alpService.getAlps());
//        return "linker";
//    }

    @Autowired
    public void setAlpService(AlpService alpService) {
        this.alpService = alpService;
    }

    @Autowired
    public void setService(LinkerService service) {
        this.service = service;
    }
}


















