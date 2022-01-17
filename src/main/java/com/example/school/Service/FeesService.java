package com.example.school.Service;

import com.example.school.Entities.Fees;
import com.example.school.Entities.Student;
import com.example.school.Respository.FeesRepository;
import com.example.school.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeesService {

    @Autowired
    private FeesRepository feesRepository;

    List<Fees> list;


    public FeesService(FeesRepository feesRepository) {
        this.feesRepository = feesRepository;
    }

    public List<Fees> getFeesRecord() {
        return feesRepository.findAll();
    }


    public Optional<Fees> getFeesRecordById(int id) {
        return feesRepository.findById(id);
    }



    public Fees add(Fees fees)
    {
        return feesRepository.save(fees);
    }



    public Fees update(Fees fees)
    {
        return feesRepository.save(fees);
    }



    public void delete(int Id) {
        Fees del= feesRepository.getOne(Id);
        feesRepository.delete(del);
    }

}
