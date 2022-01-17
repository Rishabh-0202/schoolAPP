package com.example.school.Service;

import com.example.school.Entities.Development;
import com.example.school.Entities.Sports;
import com.example.school.Respository.DevelopmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevelopmentService {

    @Autowired
    private DevelopmentRepository developmentRepository;

    public DevelopmentService(DevelopmentRepository developmentRepository) {
        this.developmentRepository = developmentRepository;
    }

    public List<Development> getallDevelopment()
    {
        return developmentRepository.findAll();
    }
    public Optional<Development> getDevelopmentbyId(int id)
    {
        return developmentRepository.findById(id);
    }

    public Development add(Development development)
    {
        return developmentRepository.save(development);
    }
    public Development update(Development development)
    {
        return developmentRepository.save(development);
    }
    public void delete(int id)
    {
        Development del= developmentRepository.getOne(id);
        developmentRepository.delete(del);
    }
}
