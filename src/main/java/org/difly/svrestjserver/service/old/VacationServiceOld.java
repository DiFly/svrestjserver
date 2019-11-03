package org.difly.svrestjserver.service.old;

import org.difly.svrestjserver.model.old.VacationOld;
import org.difly.svrestjserver.repository.old.VacationRepositoryOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VacationServiceOld {
    @Autowired
    private VacationRepositoryOld vacationRepositoryOld;

    public List<VacationOld> getAllVacation() {
        List<VacationOld> vacationOlds = new ArrayList<>();
        vacationRepositoryOld.findAll().forEach(vacation -> vacationOlds.add(vacation));
        return vacationOlds;
    }

    public VacationOld getVacationById(UUID id) {
        return vacationRepositoryOld.findById(id).get();
    }

    public void saveOrUpdate(VacationOld vacationOld) {
        vacationRepositoryOld.save(vacationOld);
    }

    public List<VacationOld> getAllVacationByUserId(long userId) {
        List<VacationOld> vacationOlds = new ArrayList<>();
        vacationRepositoryOld.findByEmployeeId(userId).forEach(vacation -> vacationOlds.add(vacation));
        return vacationOlds;
    }
}
