package org.difly.svrestjserver.service;

import org.difly.svrestjserver.model.Vacation;

import java.time.LocalDate;
import java.util.Random;

import static java.time.temporal.ChronoUnit.DAYS;

public class VacationCreator {
    public Vacation getVacation(long employeeId) {
        Vacation vac = new Vacation();

        vac.setEmployeeId(employeeId);
        vac.setStartDate(startDate());
        vac.setEndDate(endDate(vac.getStartDate()));
        vac.setComment(comment());
        vac.setApproverComment(comment());
        vac.setApproverId(approverId());
        vac.setStatus(status());
        vac.setCreateDateTime(createDateTime(vac.getStartDate()));
        vac.setStatusChangeDate(statusChangeDate(vac.getCreateDateTime(), vac.getStartDate()));
        vac.setDeleted(deleted());

        return vac;
    }


    private LocalDate startDate() {
        long minDay = LocalDate.of(2005, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = (long) ((long) minDay + (Math.random() * (maxDay - minDay)));
        return LocalDate.ofEpochDay(randomDay);
    }

    private LocalDate endDate(LocalDate startDate) {
        int randomCount = new Random().nextInt(35);
        LocalDate endDate = startDate.plusDays(randomCount);
        return endDate;
    }

    private String comment() {
        String texts [] = {
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        };

        int x = new Random().nextInt(texts.length);
        return texts[x];
    }

    private long approverId() {
        long l = (long)(new Random().nextInt(98) + 4);
        return l;
    }

    private int status() {
        int x = new Random().nextInt(3);
        return x;
    }

    private LocalDate createDateTime(LocalDate startDate) {
        int randomCount = new Random().nextInt(100);
        LocalDate createDay = startDate.minusDays(randomCount);
        return createDay;
    }

    private LocalDate statusChangeDate(LocalDate createDateTime, LocalDate startDate) {
        int daysBetween = (int) DAYS.between(createDateTime, startDate) + 1;

        int randomCount = new Random().nextInt(Math.abs(daysBetween));
        LocalDate statusChanges = startDate.minusDays(randomCount);
        return statusChanges;
    }

    private boolean deleted() {
        if (new Random().nextBoolean()) {
            return true;
        } else {
            return false;
        }
    }

}
