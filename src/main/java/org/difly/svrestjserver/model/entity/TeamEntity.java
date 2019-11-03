package org.difly.svrestjserver.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.difly.svrestjserver.model.EmployeeTeam;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "team_table")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name = null;
    private UUID teamLeadId = null;
    private Boolean deleted = null;

//    @JsonIdentityReference
//    @JsonIdentityInfo(
//            property = "id",
//            generator = ObjectIdGenerators.PropertyGenerator.class
//    )
//    @OneToMany(fetch = FetchType.EAGER)
//    private List<EmployeeTeam> employeeTeams = null;
    @JsonIdentityReference
    @JsonIdentityInfo(
            property = "id",
            generator = ObjectIdGenerators.PropertyGenerator.class
    )
    @OneToMany(fetch = FetchType.EAGER)
    private List<EmployeeEntity> employees = null;
}
