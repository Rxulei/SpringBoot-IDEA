package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author xulei
 * @date 2020/11/5 - 17:10
 */

// 加上@Controller，表示这是控制层的类
@Controller
public class IndexController {
    /*
    打开：http://localhost:8080/say
    输出：say:Hello SpringBoot!
    * */

    // 设置方法的请求路径
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say:Hello SpringBoot!";
    }

    /*
    * 打开http://localhost:8080/mapvalue
    * 输出：{"message":"SpringBoot"}
    * */

    // 在localhost:8080 后面加上value的值就可以打开网页，查看对应的内容
    @RequestMapping(value = "/mapvalue")
    @ResponseBody
    public HashMap<String, String> mapvalue(){
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "SpringBoot");

        return map;
    }
   // 如果想要更改端口号，需要在resources目录下的application.properties加内容
}
