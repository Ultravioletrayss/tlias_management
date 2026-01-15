package org.tlias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlias.mapper.DeptMapper;
import org.tlias.pojo.Dept;
import org.tlias.service.DeptService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptmapper;


    @Override
    public List<Dept> list(){
        return deptmapper.list();
    }
    @Override
    public void delete(Integer id) {
        deptmapper.deleteById(id);
    }


    @Override
    public void add(Dept dept){
        dept.setCreate_time(LocalDateTime.now());
        dept.setUpdate_time(LocalDateTime.now());
        deptmapper.insert(dept);
    }

    @Override
    public void update(Dept dept){
        dept.setUpdate_time(LocalDateTime.now());
        deptmapper.update(dept);
    }


}
