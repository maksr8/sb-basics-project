package com.example.sb_basics_project.controller;

import com.example.sb_basics_project.dto.ProjectDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
class ProjectController {
    @PostMapping
    public String createProject(@Valid @RequestBody ProjectDto projectDto) {
        System.out.println("Received valid POST request for project: " + projectDto.getTitle());
        return "Project created successfully!";
    }

    @GetMapping("/{id}")
    public String getProjectById(@PathVariable Long id) {

        System.out.println("Received GET request for project with ID: " + id);
        return "Project details for ID: " + id;
    }

    @PutMapping("/{id}")
    public String updateProject(@PathVariable Long id, @RequestBody String updatedDetails) {

        System.out.println("Received PUT request to update project with ID: " + id + " with new details: " + updatedDetails);
        return "Project with ID " + id + " updated successfully.";
    }

    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {

        System.out.println("Received DELETE request for project with ID: " + id);
        return "Project with ID " + id + " deleted successfully.";
    }

    @GetMapping
    public String getAllProjects() {

        System.out.println("Received GET request for all projects.");
        return "List of all projects.";
    }
}
