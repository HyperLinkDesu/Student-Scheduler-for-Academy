package main.model;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private string name;
    private List<string> listOfBook;


    //Constructor
    public Student(string name) {
        this.name = name;
        this.listOfBook = new ArrayList<>();
    }



    //Getter

    public void getName() {
        return name;
    }

    public void getListOfBook() {
        return listOfBook;
    }
}
