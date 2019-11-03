package org.difly.svrestjserver.repository.old;

import org.difly.svrestjserver.model.old.VacationOld;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface VacationRepositoryOld extends CrudRepository<VacationOld, UUID> {
    List<VacationOld> findByEmployeeId(long employeeId);
}
