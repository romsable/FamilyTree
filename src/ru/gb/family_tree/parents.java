package ru.gb.family_tree;

import java.net.IDN;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class parents extends human {
    private int ChildsID;

    public int getChildsID() {
        return ChildsID;
    }

    public parents(int ID, String name, Gender gender, LocalDate birthday, int ChildsID) {
        super(ID, name, gender, birthday);
        this.ChildsID = ChildsID;
    }
        @Override
        public String toString() {
            return super.toString() + ", ChildsID: " + "[" + ChildsID + "]";
        }
    }


