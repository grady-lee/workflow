package com.example.workflow;

import java.time.Instant;

public class ApprovalStep {
    private final Approver approver;
    private Decision decision;
    private Instant decidedAt;

    public ApprovalStep(Approver approver) {
        this.approver = approver;
    }

    public Approver getApprover() {
        return approver;
    }

    public Decision getDecision() {
        return decision;
    }

    public Instant getDecidedAt() {
        return decidedAt;
    }

    public void recordDecision(Decision decision) {
        this.decision = decision;
        this.decidedAt = Instant.now();
    }
}
