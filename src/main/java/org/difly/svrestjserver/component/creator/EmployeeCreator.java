package org.difly.svrestjserver.component.creator;

import org.difly.svrestjserver.model.entity.EmployeeEntity;
import org.difly.svrestjserver.model.entity.Role;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EmployeeCreator {
    public EmployeeEntity getNewEmployee() {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName(firstname());
        employee.setSurname(surname());
        employee.setJobTitle(userRole().toString());
        employee.setRole(role());
        employee.setAvatar(userpic());
        employee.setBalance(daysavailable());
        employee.setBirthdate(birtday());
        employee.setDeleted(deleted());
        employee.setEmail(email(employee.getFirstName(), employee.getSurname(), "self.com"));
        employee.setWorkEmail(email(employee.getFirstName(), employee.getSurname(), "polytech.com"));
        employee.setIsActive(deleted());
        employee.setPhone(phone());
        employee.setSkype(employee.getSurname() + ".polyteck");
//        employee.setTeamId();
        employee.setWorkStartDate();
        employee.setWorkEndDate();

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

    private Set<Role> role() {
        Set<Role> roles = new HashSet<>();
        roles.add(userRole());
        return roles;
    }

    private String userpic () {
        String path[] = {
                "https://developers.google.com/web/images/contributors/philipwalton.jpg",
                "http://podcast.agileuprising.com/wp-content/uploads/2017/03/Close-Up-Robert-C-Martin.jpg",
                "http://www.liketotally80s.com/wp-content/uploads/2014/08/tom-hanks-80s.png",
                "https://upload.wikimedia.org/wikipedia/commons/b/b1/KeiraKnightleyByAndreaRaffin2011_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Jessica_Alba_SDCC_2014.jpg/614px-Jessica_Alba_SDCC_2014.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Dwayne_Johnson_2%2C_2013.jpg/800px-Dwayne_Johnson_2%2C_2013.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Ward_Cunningham_-_Commons-1.jpg/220px-Ward_Cunningham_-_Commons-1.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Martin_Luther_King%2C_Jr..jpg/266px-Martin_Luther_King%2C_Jr..jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/91/Bill_Gates_1977.png",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/Paul_Walker.jpg/170px-Paul_Walker.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/29/Jason_Statham_2012.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/3/33/Jeff_Bezos_2016.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/51/Warren_Buffett_KU_Visit.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/7a/Rachel_Stevens_in_Feb_2010_cropped.jpg"

        };

//        int x = new Random().nextInt(path.length -1);
        int x = new Random().nextInt(path.length);
        return path[x];
    };

    private int daysavailable() {
        return new Random().nextInt(50);
    }

    private OffsetDateTime birtday() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2005, 1, 1).toEpochDay();
        long randomDay = (long) ((long) minDay + (Math.random() * (maxDay - minDay)));
//        return LocalDate.ofEpochDay(randomDay);

        ZoneOffset offset = OffsetDateTime.now().getOffset();
        OffsetDateTime offsetDateTime = LocalDate.ofEpochDay(randomDay).atStartOfDay(offset).toOffsetDateTime();
        return offsetDateTime;
    }

    private Boolean deleted() {
        int r = new Random().nextInt(3);
        if (r ==  0) {
            return false;
        } else {
            return true;
        }
    }

    private String phone () {
        //+380 12 345 67 89
        StringBuilder str = new StringBuilder();
        str.append("+380");
        for(int x = 0; x < 9; x++) {
            str.append((new Random().nextInt(9)));
        }
        return str.toString();
    }

    private String email(String firstName, String surname, String domain) {
        return firstName.toLowerCase() + "." +
                surname.toLowerCase() + "@" +
                domain;
    }
}
