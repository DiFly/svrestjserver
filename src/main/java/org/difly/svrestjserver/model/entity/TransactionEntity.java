package org.difly.svrestjserver.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "transaction_table")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID employeeId = null;

    private Integer change = null;

    private String comment = null;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private EmployeeEntity employee = null;
}
