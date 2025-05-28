package junit;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class JUnitTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("        Это метод BeforeEach!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("        Это метод AfterEach!");
    }

    @Test
    void firstTest() {
        System.out.println("                    Это тест firstTest!");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("                    Это тест secondTest!");
        Assertions.assertTrue(3 > 2);
    }
}