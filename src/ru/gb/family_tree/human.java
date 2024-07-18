package ru.gb.family_tree;

import java.time.LocalDate;
import java.util.List;

public class human {
    private int ID;
    private String name;
    private Gender gender;
    private LocalDate birthday;

    public human(int ID, String name, Gender gender, LocalDate birthday) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }



    @Override
    public String toString() {
        return "[" + ID + "]" + " " + "name: " + name + ", gender: " + gender + ", birthday: " + birthday;
    }
}

//    List<human> parents;
//    List<human> children;
//}
