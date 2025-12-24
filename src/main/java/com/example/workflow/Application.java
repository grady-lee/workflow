package com.example.workflow;

import java.math.BigDecimal;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApprovalRequest request = new ApprovalRequest("REQ-2024-001", "Laptop Purchase", new BigDecimal("850.00"));
        ApprovalContext context = new ApprovalContext(request);

        Approver manager = new RuleBasedApprover("Manager", new BigDecimal("1000.00"));
        Approver finance = new RuleBasedApprover("Finance", new BigDecimal("5000.00"));
        Approver ceo = new RuleBasedApprover("CEO", new BigDecimal("20000.00"));

        WorkflowEngine engine = new WorkflowEngine(List.of(
            new ApprovalStep(manager),
            new ApprovalStep(finance),
            new ApprovalStep(ceo)
        ));

        ApprovalResult result = engine.run(context);

        System.out.println("Final Decision: " + result.getFinalDecision());
        result.getSteps().forEach(step -> System.out.printf(
            "Step: %s -> %s at %s%n",
            step.getApprover().name(),
            step.getDecision(),
            step.getDecidedAt()
        ));
    }
}
