package model;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private List<String> listOfBook;


    //Constructor
    public Student(String name) {
        this.name = name;
        this.listOfBook = new ArrayList<>();
    }



    //Getter

    //EFFECTS: get name of the student
    public String getName() {
        return name;
    }

    //EFFECTS: get list of books
    public List<String> getListOfBook() {
        return listOfBook;
    }
}
