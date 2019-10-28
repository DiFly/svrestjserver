package org.difly.svrestjserver.model.custom;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AvailableDays {
    private Long userId;
    private int days;
}
