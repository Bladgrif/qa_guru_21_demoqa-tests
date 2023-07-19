package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    public void setUp() {
        Configuration.timeout = 6000;
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
//        Configuration.browser = "chrome";
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @Test
    void firstTest() {
//        Configuration.pageLoadStrategy="eager"
//        Configuration.timeout=33000;
        open("https://www.google.com/");
        System.out.println("    firstTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
//        Configuration.pageLoadStrategy="eager"
//        Configuration.timeout=33000;
        open("https://www.google.com/");
        System.out.println("    secondTest");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void thirdTest() {
//        Configuration.timeout=33000;
        open("https://www.google.com/");
        System.out.println("    thirdTest");
        Assertions.assertTrue(3 > 2);
    }
}
