package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class StudentTest {
    private Student testStudent;
    private List<String> testListOfBook;

    @BeforeEach
    void runBefore() {
        testStudent = new Student("testStudent");
        testListOfBook = new ArrayList<>();

    }

    @Test
    void testConstructor() {
        assertEquals("testStudent", testStudent.getName());
        assertEquals(testListOfBook, testStudent.getListOfBook());
    }

    @Test
    void testAddBook() {
        assertEquals(0, testStudent.getListOfBook().size());
        testStudent.addBook("newBook1");
        assertEquals(1, testStudent.getListOfBook().size());
        testStudent.addBook("newBook2");
        assertEquals(2, testStudent.getListOfBook().size());

    }
}
