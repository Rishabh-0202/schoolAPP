package com.example.school.Controller;

import com.example.school.Entities.Fees;
import com.example.school.Entities.Student;
import com.example.school.Service.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FeesResource {

    @Autowired
    private FeesService feesService;

    public FeesResource(FeesService feesService) {
        this.feesService = feesService;
    }

    @GetMapping("/fees")
    public List<Fees> getFeesRecord()
    {
        return feesService.getFeesRecord();

    }

    @GetMapping("/fees/{id}")
    public Optional<Fees> getStudentbyid(@RequestBody String id)
    {
        return feesService.getFeesRecordById(Integer.parseInt(id));
    }

    @PostMapping("/fees/register")
    public Fees register(@RequestBody Fees fees)
    {
        return feesService.add(fees);
    }

    @PutMapping("/fees/update")
    public Fees update(@RequestBody Fees fees)
    {
        return feesService.update(fees);
    }

    @DeleteMapping("/fees/delete/{id}")
    public void delete(@RequestBody int id)
    {
        feesService.delete(id);
    }

}
