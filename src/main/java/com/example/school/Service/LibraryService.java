package com.example.school.Service;

import com.example.school.Entities.Employee;
import com.example.school.Entities.Library;
import com.example.school.Respository.EmployeeRepository;
import com.example.school.Respository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> getallbooks()
    {
        return libraryRepository.findAll();
    }
    public Optional<Library> getbooksbyId(int id)
    {
        return libraryRepository.findById(id);
    }

    public Library add(Library library)
    {
        return libraryRepository.save(library);
    }
    public Library update(Library library)
    {
        return libraryRepository.save(library);
    }
    public void delete(int id)
    {
        Library del= libraryRepository.getOne(id);
        libraryRepository.delete(del);
    }
}
