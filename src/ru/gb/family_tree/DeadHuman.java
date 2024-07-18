package ru.gb.family_tree;

import java.time.LocalDate;

public class DeadHuman extends human{
    private LocalDate deathdate;

    public DeadHuman(int ID, String name, Gender gender, LocalDate birthday, LocalDate deathdate) {
        super(ID, name, gender, birthday);
        this.deathdate = deathdate;
    }
    public LocalDate getDeathdate() {
        return deathdate;
    }
    @Override
    public String toString() {
        return super.toString() + "deathday: " + deathdate;
    }
}

