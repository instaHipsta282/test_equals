package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

/**
 * Dto для хранения всех SLA, назначенных для версии тестового проекта. Хранится в yaml с тестовым профилем.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestSlaDto {
    /**
     * Список всех групп SLA, выбранных пользователем.
     */
    @Singular("slaGroup")
    private List<SlaGroup> slaGroups;
}
