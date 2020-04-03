package io.exiled.salesbook.controller;

import io.exiled.salesbook.service.PreOrderService;
import io.exiled.salesbook.service.impl.PreOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(path = "/preOrder")
public class PreOrderController {
    @Autowired
    private PreOrderServiceImpl preOrderService;

    @RequestMapping
    public String getFolders(Model model){
        preOrderService.buildFilePaths("");
        List<String> folderList = preOrderService.getFolderList();
        model.addAttribute("strings",folderList);
        return "order";
    }

}
