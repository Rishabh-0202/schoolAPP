package com.example.school.Service;

import com.example.school.Entities.Employee;
import com.example.school.Entities.Student;
import com.example.school.Respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getallemployee()
    {
        return employeeRepository.findAll();
    }
    public Optional<Employee> getemployeebyId(int id)
    {
        return employeeRepository.findById(id);
    }

    public Employee add(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public Employee update(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public void delete(int id)
    {
        Employee del= employeeRepository.getOne(id);
        employeeRepository.delete(del);
    }
}
