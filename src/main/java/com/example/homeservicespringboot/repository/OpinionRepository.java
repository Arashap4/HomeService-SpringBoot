package com.example.homeservicespringboot.repository;

import com.example.homeservicespringboot.entity.capability.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpinionRepository extends JpaRepository<Opinion,Long> {


}
