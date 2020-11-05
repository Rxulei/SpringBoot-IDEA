package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulei
 * @date 2020/11/5 - 20:01
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "springboot multi-environment!";
    }
}
