package pl.wgrasmann.learnit;

import java.time.LocalDate;
import java.time.Period;

public class User {
    private String name;
    private LocalDate dob;

    public User() {
    }

    public User(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public int getAge(LocalDate currentDate) {
        return Period.between(dob, currentDate).getYears();
    }
}
