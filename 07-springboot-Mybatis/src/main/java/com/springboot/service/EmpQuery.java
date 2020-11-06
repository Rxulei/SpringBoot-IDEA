package com.springboot.service;

import com.springboot.model.Emp;

/**
 * @author xulei
 * @date 2020/11/6 - 9:57
 */
public interface EmpQuery {

    // 根据员工的工号，查询员工的信息
    Emp queryEmpByEmpno(Integer empno);
}
