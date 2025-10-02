package com.example.sb_basics_project.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record ProjectDto(
        @NotBlank(message = "Title cannot be blank") String title,
        @DecimalMin(value = "1.0", inclusive = true, message = "Budget must be at least 1.0") double budget) {

}
