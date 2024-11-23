package org_m_and_m_checklist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestGoods {
    int suit = 8;
    static int testNumber;
    static String testName= TestGoods.class.getSimpleName();


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
    public void testQuality() {
//        boolean expected = suit <=5;
        assertFalse(suit<=5,"Cовсем мало");

    }

    @Test
    public void testPackage() {
    boolean actual =isChet(suit);
    assertTrue(actual,"В чемодане 2 костюма, бери еще один");
    }
    private boolean isChet(int number) {
        return number % 2 == 0;
    }

    @Test
    public void testNull() {
        assertNotNull(suit,"Дураплясы забыли!");
    }
}
