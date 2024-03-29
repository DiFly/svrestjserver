package org.difly.svrestjserver.model.old;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userauth")
@Data
@NoArgsConstructor
public class UserOld {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;
    private @NonNull String email;
    private @NonNull String password;

}
