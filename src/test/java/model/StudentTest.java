package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class StudentTest {
    private Student testStudent;

    @BeforeEach
    void runBefore() {
        testStudent = new Student("testStudent");

    }

    @Test
    void testConstructor() {
        assertEquals("testStudent", testStudent.getName());
        assertEquals(0, testStudent.getNumOfBook());
    }

    @Test
    void testAddBook() {
        assertEquals(0, testStudent.getNumOfBook());
        testStudent.addBook();
        assertEquals(1, testStudent.getNumOfBook());
        testStudent.addBook();
        assertEquals(2, testStudent.getNumOfBook());

    }

    @Test
    void testRemoveBook() {
        assertEquals(0, testStudent.getNumOfBook());
        testStudent.addBook();
        assertEquals(1, testStudent.getNumOfBook());
        testStudent.removeBook();
        assertEquals(0, testStudent.getNumOfBook());

    }
}