package org.tlias.controller;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tlias.pojo.Emp;
import org.tlias.pojo.PageBean;
import org.tlias.pojo.Result;
import org.tlias.service.EmpService;
import org.tlias.service.DeptService;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public Result getEmps(@RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer pageSize){
        System.out.println("分页查询, page:" + page + ", pageSize:" + pageSize);

        PageBean pageBean = empService.page(page, pageSize);
        return Result.success(pageBean);
    }
}
