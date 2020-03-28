package io.exiled.salesbook.controller;

import io.exiled.salesbook.model.Img;
import io.exiled.salesbook.service.AlpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/alp")
public class AlpController {
    @Autowired
    private AlpService service;

    @RequestMapping(
            value = "/all",
            method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    @ResponseBody
    public List<Img> addHorse(Model model) {
        service.refresh();
        service.getPaths();
        service.makeCollection();
        return service.getAlps();
    }
}
