package com.example.sb_basics_project.service;

import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements IProjectService {
    private final IModerationPolicy moderationPolicy;

    public ProjectServiceImpl(IModerationPolicy moderationPolicy) {
        this.moderationPolicy = moderationPolicy;
    }
}
