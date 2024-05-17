package com.shubham.ideastracker.service;

import com.shubham.ideastracker.model.Idea;
import com.shubham.ideastracker.repository.IdeasTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IdeasTrackerService {

    @Autowired
    private IdeasTrackerRepository ideasTrackerRepository;
    List<Idea> ideas;
    Idea idea;

    public List<Idea> getAllIdeas(){
        ideas = ideasTrackerRepository.findAll();
        return ideas;
    }

    public String saveNewIdea(Idea idea){
        ideasTrackerRepository.save(idea);
        return "Object saved successfully!!";
    }

    public List<Idea> getIdeasByTag(String tag){
        ideas = ideasTrackerRepository.findByTag(tag);
        return ideas;
    }

    public List<Idea> getIdeasByDate(Date date){
        ideas = ideasTrackerRepository.findByDate(date);
        return ideas;
    }

    public Idea getIdeasById(Long id){
        idea = ideasTrackerRepository.findById(id).get();
        return idea;
    }
}
