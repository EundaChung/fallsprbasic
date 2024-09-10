package com.example.demo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {
//    @GetMapping("/create")
//    public String create(){return "board/create";}

    //PathVariable => URL에 있는 값을 변수로 받아올 수 있는 기능!
    @GetMapping("/{page}")
    public String page(@PathVariable String page) {return "board/" + page;}

    @GetMapping("/{page}/{id}")
    public String page2(@PathVariable String page, @PathVariable String id){
        return "board/" + page;
    }
}