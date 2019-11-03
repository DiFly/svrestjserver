package org.difly.svrestjserver.repository;

import org.difly.svrestjserver.model.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, UUID> {
}
