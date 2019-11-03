package org.difly.svrestjserver.repository;

import org.difly.svrestjserver.model.old.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {
}
