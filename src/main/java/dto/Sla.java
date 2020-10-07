package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Внутреннее отображение SLA, установленное пользователем.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sla {
    /**
     * ENUM с видами SLA.
     */
    @NonNull
    private RestrictionType restrictionType;
    /**
     * ENUM с видами операторов для вычисления успешности попадания в SLA.
     */
    @NonNull
    private Operation operation;
    /**
     * Значение SLA, установленное пользователем. В зависимости от значения operation результаты выше или ниже этого
     * значения будут признаны успешными или не успешными.
     */
    @NonNull
    private double value;
}
