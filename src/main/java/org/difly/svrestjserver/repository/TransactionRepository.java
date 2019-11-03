package org.difly.svrestjserver.repository;

import org.difly.svrestjserver.model.entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TransactionRepository extends CrudRepository<TransactionEntity, UUID> {
}
