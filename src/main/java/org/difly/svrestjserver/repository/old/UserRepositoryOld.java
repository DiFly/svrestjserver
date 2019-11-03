package org.difly.svrestjserver.repository.old;

import org.difly.svrestjserver.model.old.UserOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepositoryOld extends JpaRepository<UserOld, Long> {
}
