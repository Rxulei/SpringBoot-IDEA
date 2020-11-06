package com.springboot.service.imp;

import com.springboot.mapper.EmpMapper;
import com.springboot.model.Emp;
import com.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xulei
 * @date 2020/11/6 - 14:46
 */
@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp queryEmpByEmpno(Integer empno){
        return empMapper.selectByPrimaryKey(empno);
    }

}
