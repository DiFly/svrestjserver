package org.difly.svrestjserver.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "vacation")
@Data
@NoArgsConstructor
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private @NonNull Long employeeId;

    private @NonNull LocalDate startDate;
    private @NonNull LocalDate endDate;
    private String comment;
    private String approverComment;
    private Long approverId;
//    private UUID approverId;
    private int status; //	integer($int32) Enum: [ 0, 1, 2 ]
    private LocalDate statusChangeDate;
    private LocalDate createDateTime;
    private boolean deleted;
}
