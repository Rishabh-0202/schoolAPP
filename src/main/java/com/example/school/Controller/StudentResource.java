package com.example.school.Controller;

import com.example.school.Entities.Student;
import com.example.school.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentResource {

    @Autowired
    private StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> getStudent()
    {
        return studentService.getStudent();

    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentbyid(@RequestBody String id)
    {
        return studentService.getStudentById(Integer.parseInt(id));
    }

    @PostMapping("/student/register")
    public Student register(@RequestBody Student student)
    {
        return studentService.add(student);
    }

    @PutMapping("/student/update")
    public Student update(@RequestBody Student student)
    {
        return studentService.update(student);
    }

    @DeleteMapping("/student/delete/{id}")
    public void delete(@RequestBody int id)
    {
        studentService.delete(id);
    }

}
