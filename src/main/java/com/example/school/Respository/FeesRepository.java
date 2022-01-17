package com.example.school.Respository;

import com.example.school.Entities.Fees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeesRepository extends JpaRepository<Fees,Integer> {
}
