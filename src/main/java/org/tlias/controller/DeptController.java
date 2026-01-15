package org.tlias.controller;


import org.apache.ibatis.io.ResolverUtil;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tlias.pojo.Dept;
import org.tlias.pojo.Result;
import org.tlias.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list(){
    System.out.println("Query all the department data");
    List<Dept> deptList=deptService.list();

    return Result.success(deptList);
    }
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        System.out.println("delete the selected id");
        deptService.delete(id);
        return Result.success();
    }
    @PostMapping("/depts")
    public Result add(Dept dept){
        System.out.println("New Department:{}"+dept);
        deptService.add(dept);
        return Result.success();
    }
    @PutMapping("/depts")
  public Result update(@RequestBody Dept dept){
        System.out.println("Change Department: " + dept);
        deptService.update(dept);
        return Result.success();
    }

}
