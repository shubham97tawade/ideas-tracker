package com.shubham.ideastracker.controller;

import com.shubham.ideastracker.model.Idea;
import com.shubham.ideastracker.service.IdeasTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdeasTrackerController {

    @Autowired
    private IdeasTrackerService ideasTrackerService;

    @CrossOrigin
    @GetMapping("/")
    public List<Idea> getIdeas(){
        return ideasTrackerService.getAllIdeas();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Idea getIdea(@RequestParam final Long id){
        return ideasTrackerService.getIdeasById(id);
    }

    @CrossOrigin
    @PostMapping("/saveIdea")
    public String saveIdea(@RequestBody Idea idea){
        String response;
        response = ideasTrackerService.saveNewIdea(idea);
        return response;
    }
}
