package com.springboot.mapper;

import com.springboot.model.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 扫描DAO接口到Spring容器
public interface EmpMapper {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}