package org.difly.svrestjserver.service.old;

import org.difly.svrestjserver.model.old.Vacation;
import org.difly.svrestjserver.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class VacationService {
    @Autowired
    private VacationRepository vacationRepository;

    public List<Vacation> getAllVacation() {
        List<Vacation> vacations = new ArrayList<>();
        vacationRepository.findAll().forEach( vacation -> vacations.add(vacation));
        return vacations;
    }

    public Vacation getVacationById(UUID id) {
        return vacationRepository.findById(id).get();
    }

    public void saveOrUpdate(Vacation vacation) {
        vacationRepository.save(vacation);
    }

    public List<Vacation> getAllVacationByUserId(long userId) {
        List<Vacation> vacations = new ArrayList<>();
        vacationRepository.findByEmployeeId(userId).forEach( vacation -> vacations.add(vacation));
        return vacations;
    }
}
