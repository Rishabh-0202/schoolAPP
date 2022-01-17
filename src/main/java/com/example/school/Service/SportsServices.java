package com.example.school.Service;

import com.example.school.Entities.Employee;
import com.example.school.Entities.Sports;
import com.example.school.Respository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportsServices {

    @Autowired
    private SportsRepository sportsRepository;

    public SportsServices(SportsRepository sportsRepository) {
        this.sportsRepository = sportsRepository;
    }
    public List<Sports> getallsports()
    {
        return sportsRepository.findAll();
    }
    public Optional<Sports> getsportsbyId(int id)
    {
        return sportsRepository.findById(id);
    }

    public Sports add(Sports sports)
    {
        return sportsRepository.save(sports);
    }
    public Sports update(Sports sports)
    {
        return sportsRepository.save(sports);
    }
    public void delete(int id)
    {
        Sports del= sportsRepository.getOne(id);
        sportsRepository.delete(del);
    }
}
