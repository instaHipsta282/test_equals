package dto;

/**
 * Все возможные операторы для значения SLA.
 * GREATER_THEN - SLA успешен, если итоговое значение больше {@link Sla#value}
 * LESS_EQUALS - SLA успешен, если итоговое значение меньше или равно {@link Sla#value}
 */
public enum Operation {
    GREATER_THEN,
    LESS_EQUALS
}
