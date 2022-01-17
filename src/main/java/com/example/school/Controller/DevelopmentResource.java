package com.example.school.Controller;

import com.example.school.Entities.Development;
import com.example.school.Entities.Sports;
import com.example.school.Service.DevelopmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DevelopmentResource {

    @Autowired
    private DevelopmentService developmentService;

    public DevelopmentResource(DevelopmentService developmentService) {
        this.developmentService = developmentService;
    }

    @GetMapping("/development")
    public List<Development> getalldevelopment()
    {
        return developmentService.getallDevelopment();
    }

    @GetMapping("/development/{id}")
    public Optional<Development> getDevelopmentbyId(@RequestBody int id)
    {
        return developmentService.getDevelopmentbyId(id);
    }

    @PostMapping("/development/register")
    public Development register(@RequestBody Development development)
    {
        return developmentService.add(development);
    }

    @PutMapping("/development/update")
    public Development update(@RequestBody Development development)
    {
        return developmentService.update(development);
    }
    @DeleteMapping("/development/delete/{id}")
    public void delete(@RequestBody int id)
    {
        developmentService.delete(id);
    }
}
