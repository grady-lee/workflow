# workflow

一个简单的 Java 审批流示例，使用轻量的工作流引擎实现串行审批。

## 运行

```bash
mvn -q compile exec:java
```

## 说明

- `ApprovalRequest` 表示审批请求
- `WorkflowEngine` 串行执行每个 `ApprovalStep`
- `RuleBasedApprover` 使用金额阈值进行审批
