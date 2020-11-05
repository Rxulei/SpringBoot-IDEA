package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulei
 * @date 2020/11/5 - 16:46
 */

// 加上@controller，表示控制层
@Controller
public class IndexController {

    @RequestMapping(value = "/springboot/say") // 这是注解
    public @ResponseBody String say(){
        return "Hello, SpringBoot!!!";
    }
}
