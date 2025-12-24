package com.example.workflow;

import java.util.List;

public class ApprovalResult {
    private final Decision finalDecision;
    private final List<ApprovalStep> steps;

    public ApprovalResult(Decision finalDecision, List<ApprovalStep> steps) {
        this.finalDecision = finalDecision;
        this.steps = steps;
    }

    public Decision getFinalDecision() {
        return finalDecision;
    }

    public List<ApprovalStep> getSteps() {
        return steps;
    }
}
