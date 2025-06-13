package org.teachflowai.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teachflowai.Dispatcher.MCPDispatcher;
import org.teachflowai.Model.LessonPlanRequest;

@RestController
@RequestMapping("/api/plan")
@RequiredArgsConstructor
public class PlanController
{
    private final MCPDispatcher dispatcher;

    @PostMapping
    public ResponseEntity<?> generateLessonPlan(@RequestBody @Validated LessonPlanRequest request) {
        var result = dispatcher.dispatch(request);
        return ResponseEntity.ok(result);
    }

}
