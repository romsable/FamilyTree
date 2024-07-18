package ru.gb.family_tree;

import ru.gb.vending_machine.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Family_tree {
    private List<human> humans;

    public Family_tree() {
        humans = new ArrayList<human>();
    }

    public int size() {
        return humans.size();
    }

    public void addHuman(human h) {
        humans.add(h);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Семейное древо:\n");
        for (human h : humans) {
            str.append(h);
            str.append("\n");
        }
        return str.toString();
    }
}
