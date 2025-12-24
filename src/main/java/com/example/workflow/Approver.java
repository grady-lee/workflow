package com.example.workflow;

public interface Approver {
    String name();

    Decision decide(ApprovalContext context);
}
