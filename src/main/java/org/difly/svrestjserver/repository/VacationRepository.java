package org.difly.svrestjserver.repository;

import org.difly.svrestjserver.model.Vacation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface VacationRepository extends CrudRepository<Vacation, UUID> {
    List<Vacation> findByEmployeeId(long employeeId);
}
