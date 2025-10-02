package com.example.sb_basics_project.service;

import org.springframework.stereotype.Component;

@Component
public class ModerationPolicyImpl implements IModerationPolicy {

    @Override
    public boolean requiresManualReview(String projectTitle) {
        return projectTitle.toLowerCase().contains("smth");
    }
}
