package com.example.school.Controller;

import com.example.school.Entities.Employee;
import com.example.school.Respository.EmployeeRepository;
import com.example.school.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getaallEmployee()
    {
        return employeeService.getallemployee();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeebyId(@RequestBody int id)
    {
        return employeeService.getemployeebyId(id);
    }

    @PostMapping("/employee/register")
    public Employee register(@RequestBody Employee employee)
    {
        return employeeService.add(employee);
    }

    @PutMapping("/employee/update")
    public Employee update(@RequestBody Employee employee)
    {
        return employeeService.update(employee);
    }
    @DeleteMapping("/employee/delete/{id}")
    public void delete(@RequestBody int id)
    {
        employeeService.delete(id);
    }

}
