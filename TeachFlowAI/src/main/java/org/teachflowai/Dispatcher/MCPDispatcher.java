package org.teachflowai.Dispatcher;

import org.springframework.stereotype.Service;
import org.teachflowai.Model.LessonPlanRequest;

import java.util.Map;

@Service
public class MCPDispatcher {

    public Map<String, Object> dispatch(LessonPlanRequest request) {
        return Map.of(
                "topic", request.getTopic(),
                "grade", request.getGrade(),
                "subject", request.getSubject(),
                "lessonPlan", "This is a mock AI-generated lesson plan for " + request.getTopic()
        );
    }
}
