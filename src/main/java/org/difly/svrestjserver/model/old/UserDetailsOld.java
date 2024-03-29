package org.difly.svrestjserver.model.old;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "userdetails")
@Data
@NoArgsConstructor
public class UserDetailsOld {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String firstname;
    private @NonNull String surname;
    private @NonNull UserPositionOld position;
    private String userpic;
    private @NonNull String emailself;
    private @NonNull String emailwork;
    private @NonNull String phone;
    private @NonNull String skype;
    private @NonNull LocalDate datestart;
    private @NonNull UserStatusOld status;
    private LocalDate dateend;
    private LocalDate birthday;
    private Long teamId;
    private int daysavailable;
}
