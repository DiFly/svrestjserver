package org.difly.svrestjserver.repository;

import org.difly.svrestjserver.model.entity.VacationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VacationRepository extends CrudRepository<VacationEntity, UUID> {
}
