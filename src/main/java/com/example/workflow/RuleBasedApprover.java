package com.example.workflow;

import java.math.BigDecimal;
import java.util.Objects;

public class RuleBasedApprover implements Approver {
    private final String name;
    private final BigDecimal maxAmount;

    public RuleBasedApprover(String name, BigDecimal maxAmount) {
        this.name = Objects.requireNonNull(name, "name");
        this.maxAmount = Objects.requireNonNull(maxAmount, "maxAmount");
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Decision decide(ApprovalContext context) {
        BigDecimal amount = context.getRequest().getAmount();
        if (amount.compareTo(maxAmount) <= 0) {
            return Decision.APPROVE;
        }
        return Decision.REJECT;
    }
}
