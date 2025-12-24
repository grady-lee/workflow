package com.example.workflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WorkflowEngine {
    private final List<ApprovalStep> steps;

    public WorkflowEngine(List<ApprovalStep> steps) {
        this.steps = new ArrayList<>(Objects.requireNonNull(steps, "steps"));
    }

    public ApprovalResult run(ApprovalContext context) {
        for (ApprovalStep step : steps) {
            Decision decision = step.getApprover().decide(context);
            step.recordDecision(decision);
            if (decision == Decision.REJECT) {
                return new ApprovalResult(Decision.REJECT, steps);
            }
        }
        return new ApprovalResult(Decision.APPROVE, steps);
    }
}
