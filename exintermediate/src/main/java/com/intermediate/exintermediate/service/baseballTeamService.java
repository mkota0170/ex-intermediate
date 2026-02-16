package com.intermediate.exintermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intermediate.exintermediate.domain.baseballTeam;
import com.intermediate.exintermediate.repository.baseballTeamRepository;

@Service
@Transactional
public class baseballTeamService {

    @Autowired
    private baseballTeamRepository repository;
    
    public List<baseballTeam> showList(){
        return repository.showList();
    }
    public baseballTeam showDetail(String teamName){
        return repository.showDetail(teamName);
    }
}
