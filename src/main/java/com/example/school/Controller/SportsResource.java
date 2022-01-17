package com.example.school.Controller;


import com.example.school.Entities.Employee;
import com.example.school.Entities.Sports;
import com.example.school.Service.EmployeeService;
import com.example.school.Service.SportsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SportsResource {

    @Autowired
    private SportsServices sportsServices;

    public SportsResource(SportsServices sportsServices) {
        this.sportsServices = sportsServices;
    }

    @GetMapping("/sports")
    public List<Sports> getaallsports()
    {
        return sportsServices.getallsports();
    }

    @GetMapping("/sports/{id}")
    public Optional<Sports> getSportsbyId(@RequestBody int id)
    {
        return sportsServices.getsportsbyId(id);
    }

    @PostMapping("/sports/register")
    public Sports register(@RequestBody Sports sports)
    {
        return sportsServices.add(sports);
    }

    @PutMapping("/sports/update")
    public Sports update(@RequestBody Sports sports)
    {
        return sportsServices.update(sports);
    }
    @DeleteMapping("/sports/delete/{id}")
    public void delete(@RequestBody int id)
    {
        sportsServices.delete(id);
    }
}
