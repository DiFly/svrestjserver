package org.difly.svrestjserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "vacation_table")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class VacationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID employeeId = null;

    private OffsetDateTime startDate = null;

    private OffsetDateTime endDate = null;

    private String comment = null;

    private String approverComment = null;

    private UUID approverId = null;

    private OffsetDateTime statusChangeDate = null;

    private OffsetDateTime createDateTime = null;

    private Boolean deleted = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private EmployeeEntity employee = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approver_user_id")
    private EmployeeEntity approver = null;

    @ElementCollection(targetClass = VacationStatus.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "vacation_status", joinColumns = @JoinColumn(name = "vacation_id"))
    @Enumerated(EnumType.STRING)
    private Set<VacationStatus> status = null;
}

