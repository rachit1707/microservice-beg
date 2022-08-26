package com.rachit.departmentservice.department.controller;

import com.rachit.departmentservice.department.entity.Department;
import com.rachit.departmentservice.department.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentService service;

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        return service.addDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartment(@PathVariable("id") Integer id){
        return service.findByDeptId(id).get();
    }
}
