package com.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulei
 * @date 2020/11/5 - 20:34
 */
@Controller
public class IndexController {
    // 获取配置中定义的属性
    @Value("${school.name}$")
    private String schoolName;

    @Value("${student.name}$")
    private String studentName;

    @RequestMapping(value = "/cus")
    @ResponseBody
    public String say(){
        return "Hello customer " + schoolName + ":" + studentName;
    }
}
