package com.example.school.Controller;

import com.example.school.Entities.Employee;
import com.example.school.Entities.Library;
import com.example.school.Respository.EmployeeRepository;
import com.example.school.Service.EmployeeService;
import com.example.school.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LibraryResource {
    @Autowired
    private LibraryService libraryService;

    public LibraryResource(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/library")
    public List<Library> getaallLibrary()
    {
        return libraryService.getallbooks();
    }

    @GetMapping("/library/{id}")
    public Optional<Library> getEmployeebyId(@RequestBody int id)
    {
        return libraryService.getbooksbyId(id);
    }

    @PostMapping("/library/register")
    public Library register(@RequestBody Library library)
    {
        return libraryService.add(library);
    }

    @PutMapping("/library/update")
    public Library update(@RequestBody Library library)
    {
        return libraryService.update(library);
    }
    @DeleteMapping("/library/delete/{id}")
    public void delete(@RequestBody int id)
    {
        libraryService.delete(id);
    }

}
