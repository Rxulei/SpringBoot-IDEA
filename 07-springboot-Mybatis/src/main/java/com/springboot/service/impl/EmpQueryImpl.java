package com.springboot.service.impl;

import com.springboot.mapper.EmpMapper;
import com.springboot.model.Emp;
import com.springboot.service.EmpQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulei
 * @date 2020/11/6 - 10:02
 */
@Service
public class EmpQueryImpl implements EmpQuery {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp queryEmpByEmpno(Integer empno) {
        return empMapper.selectByPrimaryKey(empno);
    }
}
