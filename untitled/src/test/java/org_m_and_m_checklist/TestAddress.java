package org_m_and_m_checklist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddress {
    String city = "Moscow";
    String street = "Bolshaia Sadovaia";
    int dom = 302;// да надо убрать
    int flat = 50;// аналогично код не используется
    static int testNumber;
    static String testName= TestAddress.class.getSimpleName();


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

    @DisplayName("Проверка улицы ")
    @Test
    void testStreetLength() {
        int expectedLength = 17;
        assertEquals(street.length(), expectedLength, "Вроде та");
    }

    @DisplayName("Проверка на слитное написание ")
    @Test
    void testSpacebarInName() {
        assertTrue(street.contains(" "), "Раздельно");
    }

    @DisplayName("Провера заглавной буквы ")
    @Test
    void testRegistryName() {
        String streetUpper = street.toUpperCase();
        assertFalse(street.equals(streetUpper), "Должно быть без разницы");//специально не именно так
    }

}
