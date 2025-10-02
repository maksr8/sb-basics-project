package com.example.sb_basics_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FreelancerServiceImpl implements IFreelancerService {

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getGitHubProfileInfo(String githubUsername) {
        String url = "https://api.github.com/users/" + githubUsername;
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            return "Failed to get GitHub info for " + githubUsername + ": " + e.getMessage();
        }
    }
}
