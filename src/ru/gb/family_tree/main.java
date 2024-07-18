package ru.gb.family_tree;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Family_tree ft = new Family_tree();

        human human1 = new human(1, "Владимир", Gender.MALE, LocalDate.of(1990, 2, 10));
        parents parent1 = new parents(2, "Петр", Gender.MALE, LocalDate.of(1956, 3, 15), 1);

        ft.addHuman(human1);
        ft.addHuman(parent1);
        System.out.println(ft);
    }

}
