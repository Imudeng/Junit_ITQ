package org_m_and_m_checklist;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEscort {
    List<String> escortList = Arrays.asList("Koroviev", "Azzazelo", "Begemot");
    static int testNumber;
    static String testName= TestEscort.class.getSimpleName();


    @BeforeAll
    static void beforeAll() {
        System.out.println("Начали серию тестов: "+testName);
    }
    @AfterAll
    static void afterAll() {
        System.out.println("Закончили серию тестов: "+testName);
    }
    @BeforeEach
    public void logTestName(TestInfo testInfo) {
        System.out.println("Начнем тест " + testInfo.getDisplayName()+" класса "+ testName);
    }
    @AfterEach

    void afterEach() {
        testNumber++;
        System.out.println("Закончили тест №"+(testNumber));
    }

    @Test
    public void testEqualsEscort() {
        int expectedEscort = 3;
        assertEquals(escortList.size(), expectedEscort, "Кого то не хвататает?");
    }

    @Test
    public void testPersonFind() {
        String needPerson = "Begemot";
        assertTrue(escortList.contains(needPerson), "Кто то отстал?");
    }

    @Test
    public void testEscortOrder() {
        String expectedPerson = "Azzazelo";
        String actualPerson = escortList.get(1);
        assertTrue(actualPerson.equalsIgnoreCase(expectedPerson),"Не на своем месте");
    }


}

