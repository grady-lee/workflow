package com.example.workflow;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ApprovalContext {
    private final ApprovalRequest request;
    private final Instant createdAt;
    private final Map<String, Object> attributes;

    public ApprovalContext(ApprovalRequest request) {
        this.request = Objects.requireNonNull(request, "request");
        this.createdAt = Instant.now();
        this.attributes = new HashMap<>();
    }

    public ApprovalRequest getRequest() {
        return request;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }
}
