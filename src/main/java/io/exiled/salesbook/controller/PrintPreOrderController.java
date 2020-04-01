package io.exiled.salesbook.controller;

import io.exiled.salesbook.model.PrintPreOrder;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrintPreOrderController {

    @RequestMapping(value = "/create_print",method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public PrintPreOrder addPrintPreOrder(@RequestBody PrintPreOrder preOrder) {
        
        return preOrder;
    }
}
