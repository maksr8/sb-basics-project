package com.example.sb_basics_project.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @DecimalMin(value = "1.0", inclusive = true, message = "Budget must be at least 1.0")
    private double budget;
}
