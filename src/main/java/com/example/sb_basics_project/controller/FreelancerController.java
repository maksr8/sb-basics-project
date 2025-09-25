package com.example.sb_basics_project.controller;

import com.example.sb_basics_project.service.FreelancerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/freelancers")
class FreelancerController {

    private final FreelancerService freelancerService;

    public FreelancerController(FreelancerService freelancerService) {
        this.freelancerService = freelancerService;
    }

    @GetMapping("/{username}/github")
    public String checkGitHubProfile(@PathVariable String username) {
        return freelancerService.getGitHubProfileInfo(username);
    }
}
