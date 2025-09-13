package model;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int numOfBook;


    //Constructor
    public Student(String name) {
        this.name = name;
        this.numOfBook = 0;
    }


    //EFFECTS: add book to the student
    public void addBook() {
        numOfBook++;
    }

    public void removeBook() {
        if (numOfBook != 0) {
            numOfBook--;
        }
    }

    //Getter

    //EFFECTS: get name of the student
    public String getName() {
        return name;
    }

    //EFFECTS: get list of books
    public int getNumOfBook() {
        return numOfBook;
    }
}
