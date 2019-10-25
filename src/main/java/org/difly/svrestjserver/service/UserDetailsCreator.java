package org.difly.svrestjserver.service;

import org.difly.svrestjserver.model.UserDetails;
import org.difly.svrestjserver.model.UserPosition;
import org.difly.svrestjserver.model.UserStatus;

import java.time.LocalDate;
import java.util.Random;

public class UserDetailsCreator {
    public UserDetails getUserDetails(){
        UserDetails user = new UserDetails();

        user.setFirstname(firstname());
        user.setSurname(surname());
        user.setPosition(userPosition());
        user.setUserpic(userpic());
        user.setEmailself(emailself(user.getFirstname()+"."+user.getSurname()));
        user.setEmailwork(emailwork(user.getFirstname()+"."+user.getSurname()));
        user.setPhone(phone());
        user.setSkype(skype(user.getFirstname()));
        user.setBirthday(birtday());
        user.setDatestart(datestart());
        user.setStatus(status());
        user.setDaysavailable(daysavailable());

        return user;
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

    private UserPosition userPosition () {
        int x = new Random().nextInt(UserPosition.values().length);
        switch (x) {
            case 0:
                return UserPosition.Admin;
            case 1:
                return UserPosition.TeamLeader;
            case 2:
                return UserPosition.AccountManager;
            default:
                return UserPosition.AccountManager;
        }
    }

    private String userpic () {
        String path[] = {
                "https://developers.google.com/web/images/contributors/philipwalton.jpg",
                "http://podcast.agileuprising.com/wp-content/uploads/2017/03/Close-Up-Robert-C-Martin.jpg",
                "http://www.liketotally80s.com/wp-content/uploads/2014/08/tom-hanks-80s.png",
                "https://upload.wikimedia.org/wikipedia/commons/b/b1/KeiraKnightleyByAndreaRaffin2011_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/Jessica_Alba_SDCC_2014.jpg/614px-Jessica_Alba_SDCC_2014.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/7a/Rachel_Stevens_in_Feb_2010_cropped.jpg"

        };

        int x = new Random().nextInt(path.length -1);
        return path[x];
    };

    private String emailself (String name) {
        return (name + "@self.com");
    }

    private String emailwork (String name) {
        return (name + "@polyteck.com");
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

    private String skype (String name) {
        return (name + ".skype");
    };

    private LocalDate birtday() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2005, 1, 1).toEpochDay();
        long randomDay = (long) ((long) minDay + (Math.random() * (maxDay - minDay)));
        return LocalDate.ofEpochDay(randomDay);
    }

    private LocalDate datestart () {
        long minDay = LocalDate.of(2005, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = (long) ((long) minDay + (Math.random() * (maxDay - minDay)));
        return LocalDate.ofEpochDay(randomDay);
    };

    private UserStatus status () {
        int x = new Random().nextInt(UserStatus.values().length);
        switch (x) {
            case 0:
                return UserStatus.Active;
            case 1:
                return UserStatus.Dismiss;
            default:
                return UserStatus.Active;
        }
    };

    private int daysavailable() {
        return new Random().nextInt(50);
    }
//    private Date dateend;
//    private Long teamId;

}
