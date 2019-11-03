package org.difly.svrestjserver.repository;

import org.difly.svrestjserver.model.entity.TeamEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeamRepository extends CrudRepository<TeamEntity, UUID> {
}
