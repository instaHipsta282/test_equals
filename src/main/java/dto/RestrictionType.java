package dto;

/**
 * Метрики, на которые можно установить SLA.
 * AVERAGE - SLA на среднее время ответа(average response time).
 * ERROR_RATE - SLA на соотношение успешно выполненных запросов к ошибкам.
 * PERCENTILE_95 - SLA на 95 перцентиль времени ответа(95 percentile response time).
 * THROUGHPUT - SLA на пропускную способность или количество запросов в секунду(response per second).
 */
public enum RestrictionType {
    AVERAGE,
    ERROR_RATE,
    PERCENTILE_95,
    THROUGHPUT
}
