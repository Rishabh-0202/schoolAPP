package com.example.school.Service;

import com.example.school.Entities.Student;
import com.example.school.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    List<Student> list;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    public List<Student> getStudent() {
        return studentRepository.findAll();
    }


    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }



    public Student add(Student student)
    {
        return studentRepository.save(student);
    }



    public Student update(Student student)
    {
        return studentRepository.save(student);
    }



    public void delete(int Id) {
            Student del= studentRepository.getOne(Id);
            studentRepository.delete(del);
    }

}

