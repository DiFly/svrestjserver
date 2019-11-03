package org.difly.svrestjserver.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "employee_of_vacation")
@NoArgsConstructor
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

//    private List<Transaction> transactions = null;
//    private List<Vacation> vacations = null;
//    private List<Vacation> approvedVacations = null;
//    private List<EmployeeTeam> employeeTeams = null;
//    private List<Team> leadedTeams = null;
}
