package org.difly.svrestjserver.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "employee_table")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName = null;
    private String surname = null;
    private String avatar = null;
    private OffsetDateTime birthdate = null;
    private String jobTitle = null;
    private String workEmail = null;
    private String email = null;
    private String phone = null;
    private String skype = null;
    private OffsetDateTime workStartDate = null;
    private Boolean isActive = null;
    private OffsetDateTime workEndDate = null;
    private Boolean deleted = null;
    private Integer balance = null;
    private UUID teamId = null;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> role;

    @JsonIdentityReference
    @JsonIdentityInfo(
            property = "id",
            generator = ObjectIdGenerators.PropertyGenerator.class
    )
    @OneToMany(fetch = FetchType.EAGER)
    private Set<TransactionEntity> transactions = null;
    @JsonIdentityReference
    @JsonIdentityInfo(
            property = "id",
            generator = ObjectIdGenerators.PropertyGenerator.class
    )
    @OneToMany(fetch = FetchType.EAGER)
    private Set<VacationEntity> vacations;
//    @JsonIdentityReference
//    @JsonIdentityInfo(
//            property = "id",
//            generator = ObjectIdGenerators.PropertyGenerator.class
//    )
//    @OneToMany
//    private List<VacationEntity> approvedVacations = null;
//    private List<EmployeeTeam> employeeTeams = null;
//    private List<Team> leadedTeams = null;
}
