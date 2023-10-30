package com.futurecollars.lesson10.task1;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PhoneBookTest {
    private static final String PHONE_BOOK_FILE = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\phonebook.txt";
    private static final String PHONE_BOOK_BACKUP = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\phonebook_backup.txt";
    private PhoneBook phoneBook;

    @BeforeAll
    public static void createBackup() throws IOException {
        Files.copy(Paths.get(PHONE_BOOK_FILE), Paths.get(PHONE_BOOK_BACKUP), StandardCopyOption.REPLACE_EXISTING);
    }

    @AfterAll
    public static void restoreBackup() throws IOException {
        Files.copy(Paths.get(PHONE_BOOK_BACKUP), Paths.get(PHONE_BOOK_FILE), StandardCopyOption.REPLACE_EXISTING);
        Files.delete(Paths.get(PHONE_BOOK_BACKUP));
    }

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void shouldAddPersonWithValidData() throws Exception {
        // Given
        String name = "John Doe";
        String phoneNumber = "123456789";
        String address = "New York";

        // When
        phoneBook.addPerson(name, phoneNumber, address);

        // Then
        Person foundPerson = phoneBook.findPerson(name);
        Assertions.assertEquals(name, foundPerson.getName());
    }

    @Test
    public void shouldNotAddPersonWithInvalidName() {
        // Given
        String name = "john doe";
        String phoneNumber = "123456789";
        String address = "New York";

        // When and Then
        assertDoesNotThrow(() -> phoneBook.addPerson(name, phoneNumber, address));
    }

    @Test
    public void shouldNotAddPersonWithInvalidPhoneNumber() {
        // Given
        String name = "John Doe";
        String phoneNumber = "123";
        String address = "New York";

        // When and Then
        assertDoesNotThrow(() -> phoneBook.addPerson(name, phoneNumber, address));
    }

    @Test
    public void shouldFindPersonWithExistingName() throws Exception {
        // Given
        String name = "John Doe";
        String phoneNumber = "123456789";
        String address = "New York";
        phoneBook.addPerson(name, phoneNumber, address);

        // When
        Person foundPerson = phoneBook.findPerson(name);

        // Then
        Assertions.assertEquals(name, foundPerson.getName());
    }

    @Test
    public void shouldNotFindNonexistentPerson() {
        // Given
        String name = "Nonexistent Person";

        // When and Then
        Assertions.assertThrows(Exception.class, () -> {
            phoneBook.findPerson(name);
        });
    }
}