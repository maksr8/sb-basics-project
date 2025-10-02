package com.example.sb_basics_project.service;

public interface IModerationPolicy {

    boolean requiresManualReview(String projectTitle);
}
