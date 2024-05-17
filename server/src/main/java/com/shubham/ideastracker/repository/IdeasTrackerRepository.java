package com.shubham.ideastracker.repository;

import com.shubham.ideastracker.model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IdeasTrackerRepository extends JpaRepository<Idea, Long> {
    List<Idea> findByTag(String tag);
    List<Idea> findByDate(Date date);
}
