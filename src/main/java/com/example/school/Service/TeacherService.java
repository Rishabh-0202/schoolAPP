package com.example.school.Service;

import com.example.school.Entities.Teacher;
import com.example.school.Respository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }


    public Optional<Teacher> getTeacherById(int id) {
        return teacherRepository.findById(id);
    }



    public Teacher add(Teacher teacher)
    {
        return teacherRepository.save(teacher);
    }



    public Teacher update(Teacher teacher)
    {
        return teacherRepository.save(teacher);
    }



    public void delete(int Id) {
        Teacher del= teacherRepository.getOne(Id);
        teacherRepository.delete(del);
    }

}
