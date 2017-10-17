package com.pluboj.courses.model;

import java.util.List;

public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
