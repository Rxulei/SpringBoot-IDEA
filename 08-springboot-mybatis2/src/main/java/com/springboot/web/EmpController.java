package com.springboot.web;

import com.springboot.model.Emp;
import com.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulei
 * @date 2020/11/6 - 14:30
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empservice;

    @RequestMapping(value = "/emp")
    @ResponseBody
    public Object queryEmpByEmpno(Integer empno){
        // 调用业务层的方法
        Emp emp = empservice.queryEmpByEmpno(empno);
        return emp;
    }
}
/*
* 输入：http://localhost:8080/emp?empno=7521
* 输出：{"empno":7521,"ename":"WARD","job":"SALESMAN","mgr":7698,"hiredate":"1981-02-21T16:00:00.000+00:00","sal":1250.0,"comm":500.0,"deptno":30}
* */