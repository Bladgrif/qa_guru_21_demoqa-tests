package ru.wildberries.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.wildberries.TestBase;
import ru.wildberries.pages.MainPage;
import ru.wildberries.pages.SectionPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class WildberriesTest extends TestBase {

    @BeforeEach()
    void openPage() {
        open("https://www.wildberries.ru/");
    }



    MainPage mainPage = new MainPage();
    SectionPage sectionPage = new SectionPage();

    @ParameterizedTest(name = "User can move to {0} through the main page")
    @ValueSource(
            strings = {"Женщинам", "Дом", "Мебель"}
    )
    void userCanNavigateToSectionFromMainPage(String section) {
        mainPage.waitUntilCatalogLoads()
                .openCatalog()
                .clickOnSectionFromCatalog(section);

        sectionPage.checkSectionTitle(section);
    }

    @ParameterizedTest(name = "The section {0} contains {1}")
    @CsvFileSource(resources = "/userCanOpenItemInCatalogFromMainPage.csv")
    void userCanOpenItemInCatalogFromMainPage(String section, String subSection) {
        mainPage.waitUntilCatalogLoads()
                .openCatalog()
                .hoverOnSectionFromCatalog(section)
                .checkSubSection(subSection);

    }

    static Stream<Arguments> methodSourceuserCanNavigateToSectionFromMainPageWithStream() {
        return Stream.of(
                // с первым запуском тест получит в виде аргументов строки и список
                Arguments.of("Женщинам"),
                // со вторым запуском уже другую строку и список
                Arguments.of("Дом"),
                Arguments.of("Мебель")
        );
    }

    @MethodSource("methodSourceuserCanNavigateToSectionFromMainPageWithStream")
    @ParameterizedTest(name = "User can move to {0} through the main page")
    void userCanNavigateToSectionFromMainPageWithStream(String first) {
        mainPage.waitUntilCatalogLoads()
                .openCatalog()
                .clickOnSectionFromCatalog(first);

        sectionPage.checkSectionTitle(first);
    }
}
