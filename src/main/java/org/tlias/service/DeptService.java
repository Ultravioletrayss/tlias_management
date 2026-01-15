package org.tlias.service;


import org.springframework.stereotype.Service;
import org.tlias.pojo.Dept;

import java.util.List;


public interface DeptService
{
    List<Dept> list();
    void delete(Integer id);
    void add(Dept dept);
    void update(Dept dept);
}
