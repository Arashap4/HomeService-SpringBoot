package com.example.homeservicespringboot.service.impl;

import com.example.homeservicespringboot.entity.capability.Opinion;
import com.example.homeservicespringboot.repository.OpinionRepository;
import com.example.homeservicespringboot.service.OpinionService;
import org.springframework.stereotype.Service;

@Service
public class OpinionServiceImpl implements OpinionService {
    private OpinionRepository opinionRepository;
    // constructor


    @Override
    public boolean createOpinion(Opinion opinion) {
        return false;
    }
}
