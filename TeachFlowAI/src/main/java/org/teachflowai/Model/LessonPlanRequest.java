package org.teachflowai.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LessonPlanRequest
{
    @NotBlank
    private String topic;

    @NotBlank
    private String grade;

    @NotBlank
    private String subject;

}
