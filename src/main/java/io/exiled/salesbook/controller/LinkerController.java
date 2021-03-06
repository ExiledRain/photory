package io.exiled.salesbook.controller;

import io.exiled.salesbook.service.LinkerService;
import io.exiled.salesbook.service.PhotoryService;
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

    @Value("${photory.path}")
    private String defaultFolder;

    @RequestMapping
    public String baseLinker(Model model) {
        model.addAttribute("folders",service.getFolders(defaultFolder));
        return "linker";
    }

    @RequestMapping("/{link1}")
    public String getFolders(
            Model model,
            @PathVariable String link1
    ){
        String root = defaultFolder;
//        String updatedLink = service.updateLink(link1);
        String updatedLink = root + "/" + link1;

        model.addAttribute("folders",service.getFolders(updatedLink));
        model.addAttribute("roots",service.getRootPath(updatedLink));

        return "linker";
    }

    @RequestMapping("/{link1}/{link2}")
    public String get2Folders(
            Model model,
            @PathVariable String link1,
            @PathVariable String link2
    ) {
        String root = defaultFolder;
        String updatedLink = root + "/" + link1 + "/" + link2;
        model.addAttribute(service.getFolders(updatedLink));
        model.addAttribute("roots",service.getRootPath(updatedLink));
        return "linker";
    }
}
