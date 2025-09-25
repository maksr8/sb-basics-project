package com.example.sb_basics_project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FreelancerService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getGitHubProfileInfo(String githubUsername) {
        String url = "https://api.github.com/users/" + githubUsername;
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            return "Failed to get GitHub info for " + githubUsername + ": " + e.getMessage();
        }
    }
}
