package com.example.school.Controller;

import com.example.school.Entities.Student;
import com.example.school.Entities.Teacher;
import com.example.school.Service.StudentService;
import com.example.school.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TeacherResource {

    @Autowired
    private TeacherService teacherService;

    public TeacherResource(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher")
    public List<Teacher> getallteachers()
    {
        return teacherService.getTeacher();

    }

    @GetMapping("/teacher/{id}")
    public Optional<Teacher> getteacherbyId(@RequestBody int id)
    {
        return teacherService.getTeacherById(id);
    }

    @PostMapping("/teacher/register")
    public Teacher register(@RequestBody Teacher teacher)
    {
        return teacherService.add(teacher);
    }

    @PutMapping("/teacher/update")
    public Teacher update(@RequestBody Teacher teacher)
    {
        return teacherService.update(teacher);
    }

    @DeleteMapping("/teacher/delete/{id}")
    public void delete(@RequestBody int id)
    {
        teacherService.delete(id);
    }

}
