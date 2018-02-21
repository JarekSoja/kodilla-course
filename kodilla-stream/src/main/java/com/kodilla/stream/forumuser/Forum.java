package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "alvie", 'M', LocalDate.of(1980, 3, 11), 0 ));
        listOfUsers.add(new ForumUser(2, "berta", 'F', LocalDate.of(1990, 2, 1), 2444));
        listOfUsers.add(new ForumUser(3, "frank", 'M', LocalDate.of(1999, 7, 21), 53 ));
        listOfUsers.add(new ForumUser(4, "delver", 'M', LocalDate.of(1986, 3, 11), 299 ));
        listOfUsers.add(new ForumUser(5, "eddie", 'F', LocalDate.of(1960, 2, 18), 6669 ));
        listOfUsers.add(new ForumUser(6, "grunt", 'M', LocalDate.of(1975, 11, 14), 257 ));
        listOfUsers.add(new ForumUser(7, "hiker", 'M', LocalDate.of(1999, 5, 5), 995 ));
        listOfUsers.add(new ForumUser(8, "indie", 'F', LocalDate.of(2002, 8, 3), 9449 ));
        listOfUsers.add(new ForumUser(9, "jamala", 'F', LocalDate.of(1959, 7, 8), 29 ));
        listOfUsers.add(new ForumUser(10, "koloe", 'F', LocalDate.of(1970, 4, 22), 325 ));
        listOfUsers.add(new ForumUser(11, "snake", 'F', LocalDate.of(1992, 2, 22), 744 ));
        listOfUsers.add(new ForumUser(12, "spring", 'M', LocalDate.of(1953, 5, 2), 632 ));
        listOfUsers.add(new ForumUser(13, "trusty", 'M', LocalDate.of(2004, 4, 1), 3 ));
        listOfUsers.add(new ForumUser(14, "usher", 'F', LocalDate.of(1993, 1, 27), 6334 ));
        listOfUsers.add(new ForumUser(15, "violet", 'F', LocalDate.of(1988, 10, 4), 634 ));
        listOfUsers.add(new ForumUser(16, "zebra", 'M', LocalDate.of(1954, 3, 6), 96 ));
        listOfUsers.add(new ForumUser(17, "zzaper", 'F', LocalDate.of(1995, 8, 7), 339 ));
    }

    public List<ForumUser> getBookList(){
        return new ArrayList<>(listOfUsers);
    }
}
