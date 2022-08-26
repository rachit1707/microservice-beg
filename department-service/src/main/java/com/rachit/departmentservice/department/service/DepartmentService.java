package com.rachit.departmentservice.department.service;

import com.rachit.departmentservice.department.entity.Department;
import com.rachit.departmentservice.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Optional<Department> findByDeptId(Integer id){
       return departmentRepository.findById(id);
    }

    public Department addDepartment(Department department){
        return departmentRepository.save(department);
    }
}
