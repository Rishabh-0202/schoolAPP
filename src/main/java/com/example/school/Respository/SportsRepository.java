package com.example.school.Respository;

import com.example.school.Entities.Sports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsRepository extends JpaRepository<Sports,Integer> {
}
