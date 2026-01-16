package org.tlias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tlias.mapper.EmpMapper;
import org.tlias.pojo.Emp;
import org.tlias.pojo.PageBean;
import org.tlias.service.EmpService;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer size) {
        Long count = empMapper.count();
        List<Emp> empList = empMapper.page((page - 1) * size, size);
        PageBean pageBean = new PageBean(count, empList);
        return pageBean;
    }

}
