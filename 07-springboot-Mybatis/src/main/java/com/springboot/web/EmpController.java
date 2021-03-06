package com.springboot.web;

import com.springboot.model.Emp;
import com.springboot.service.EmpQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulei
 * @date 2020/11/6 - 9:53
 */
@Controller
public class EmpController {

    @Autowired
    private EmpQuery empquery;

    // 输入：http://localhost:8080/emp?empno=7521
    // 就得到了emp表中，empno等于7521的员工的所有信息，
    // 可以继续改变empno的值，查询其他员工的信息
    @RequestMapping(value = "/emp")
    @ResponseBody
    public Object emp(Integer empno){
        Emp emp = empquery.queryEmpByEmpno(empno);
        return emp;
    }
}
