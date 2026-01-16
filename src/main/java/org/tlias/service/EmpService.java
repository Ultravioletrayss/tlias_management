package org.tlias.service;

import org.tlias.pojo.PageBean;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize);

}
