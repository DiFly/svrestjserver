package org.difly.svrestjserver.component.creator;

import org.difly.svrestjserver.model.entity.EmployeeEntity;
import org.difly.svrestjserver.model.entity.Role;

import java.util.Random;

public class EmployeeCreator {
    public EmployeeEntity getNewEmployee() {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName(firstname());
        employee.setSurname(surname());
        employee.setJobTitle(userRole().toString());
        employee.setAvatar();
        employee.setBalance();
        employee.setBirthdate();
        employee.setDeleted();
        employee.setEmail();
        employee.setIsActive();
        employee.setPhone();
        employee.setRole();
        employee.setSkype();
        employee.setTeamId();
        employee.setWorkEmail();
        employee.setWorkEndDate();
        employee.setWorkStartDate();

        return employee;
    }

    private String firstname () {
        String list [] = {"Aarika", "Abbie", "Alan", "Alisha", "Bob", "Carolina", "Cassandra", "Christopher", "Deny", "Kelly",
                "Freddy", "Melvin", "Mike", "Muhammad", "Murdock", "Natale", "Ozzi", "William", "George", "Thomas",
                "Julius", "Martin", "Joseph", "Isaac", "Leonardo", "Ronald", "Charles", "Gautama", "Anna", "Vladimir",
                "Michelangelo", "Harry", "Marie", "Victoria", "Elizabeth", "Richard"};
        int x = new Random().nextInt(list.length -1);
        String str = list[x];
        return str;
    }

    private String surname () {
        String list [] = {"Chariot", "Mercury", "Gladi", "Kelsi", "Timberlake", "Kym", "Clinton", "Trump", "Gold", "Max",
                "Tarman", "Ozborn", "Shakespeare", "Lincoln", "Washington", "Jefferson", "Darwin", "Marx", "Caesar", "Luther",
                "Stalin", "Einstein", "Columbus", "Newton", "Mozart", "Beethoven", "da Vinci", "Reagan", "Dickens", "Edison",
                "Freud", "Cromwell", "Buddha", "van Gogh", "Lenin", "Truman", "Tesla", "Curie", "Boleyn"};
        int x = new Random().nextInt(list.length -1);
        String str = list[x];
        return str;
    }

    private Role userRole () {
        int x = new Random().nextInt(Role.values().length);
        switch (x) {
            case 0:
                return Role.ADMINISTRATOR;
            case 1:
                return Role.TEAM_LEADER;
            default:
                return Role.ACCOUNT_MANAGER;
        }
    }
}
