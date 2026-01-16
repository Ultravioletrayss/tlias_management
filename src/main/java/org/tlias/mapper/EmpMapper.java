package org.tlias.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.tlias.pojo.Emp;

import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("select count(*) from emp")
    public Long count();

    @Select("select * from emp limit #{start},#{pageSize}")
    public List<Emp> page(Integer start,Integer pageSize);

}
