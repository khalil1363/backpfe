package com.supportportal.Service;

import java.util.List;

import com.supportportal.Module.Department;

public interface DepartmentService {

    List<Department> getAllDepartments();

    Department getDepartmentById(Long idDepartement);

    Department saveDepartment(Department department);

    void deleteDepartment(Long idDepartement);
}