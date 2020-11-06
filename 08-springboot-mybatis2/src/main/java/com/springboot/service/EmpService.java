package com.springboot.service;

import com.springboot.model.Emp;

/**
 * @author xulei
 * @date 2020/11/6 - 14:43
 */
// 当有多个接口时，不在这儿加：@Mapper，
// 在Springboot的启动入口类：Application前面加
public interface EmpService {
    //  接口中的方法，在接口的实现类中实现

    // 根据empno查询员工的信息
    Emp queryEmpByEmpno(Integer empno);
}
