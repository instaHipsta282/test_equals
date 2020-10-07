package dto;

/**
 * Все группы, на которые можно назначить SLA.
 * TEST - SLA на сущность тест.
 * TRANSACTION - SLA на сущность транзакция.
 * REQUEST - SLA на сущность запрос.
 */
public enum TargetType {
    TEST,
    TRANSACTION,
    REQUEST
}
