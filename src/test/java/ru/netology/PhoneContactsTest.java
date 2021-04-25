package ru.netology;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.Main.phoneContacts;

class PhoneContactsTest {

    @BeforeAll
    public static void beforeAll () {
        PhoneContacts phoneContacts = new PhoneContacts(new HashMap<String, List<Contact>>());
        System.out.println(phoneContacts.hashCode());
        Assertions.assertNotNull(phoneContacts);
    }

    @AfterAll
    public static void afterAll () {
        PhoneContacts phoneContacts2 = new PhoneContacts(new HashMap<String, List<Contact>>());
        Assertions.assertNotSame(phoneContacts, phoneContacts2);
    }

    @BeforeEach
    public void beforeEach() {
        Assertions.assertNotNull(phoneContacts);
        phoneContacts.addContactToGroup(new Contact("IVAN","qwer"), new String[1]);
    }

    @AfterEach
    public void afterEach () {

        Assertions.assertNotNull(phoneContacts);
        System.out.println(phoneContacts.hashCode());
    }


    @org.junit.jupiter.api.Test
    void createGroup() {
        List<Contact> newGroup = new ArrayList<>();
        phoneContacts.createGroup("Test");
        Assertions.assertNotNull(phoneContacts.hashCode());
    }

    @org.junit.jupiter.api.Test
    void addContactToGroup() {
        Contact contact = new Contact("IVAN","11213121");
        phoneContacts.addContactToGroup(contact, new String[1]);
        Assertions.assertNotSame(contact, phoneContacts);
    }

    @org.junit.jupiter.api.Test
    void print() {
        Assertions.assertNotEquals(phoneContacts.toString(), phoneContacts.hashCode());
    }
}