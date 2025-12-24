package com.example.workflow;

import java.math.BigDecimal;
import java.util.Objects;

public class ApprovalRequest {
    private final String id;
    private final String title;
    private final BigDecimal amount;

    public ApprovalRequest(String id, String title, BigDecimal amount) {
        this.id = Objects.requireNonNull(id, "id");
        this.title = Objects.requireNonNull(title, "title");
        this.amount = Objects.requireNonNull(amount, "amount");
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
