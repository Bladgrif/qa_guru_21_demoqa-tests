package sandbox;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testone {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://google.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";

    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    public void Test_first() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse("28.11.2020", formatter);

        //noinspection ResultOfMethodCallIgnored
        localDate.getDayOfWeek();

        assertEquals(DayOfWeek.SATURDAY, localDate.getDayOfWeek());


        var findall = "shift + shift";
        var createNewClass = "alt+ insert - добавление всего";
        var choose_some = "ctr + shift + space - подбирать данные в методах";
        var reafactor = "ctr + alt + v -  упрощать выражения";
        var name = "q + w.var - дадим название переменной";
        var cicle = " 3.for - цикл от 1 до 3";
        var find = "ctr + space + space -  поиск методов , лучше чем alt + enter";
        var delet = "crt + alt + o - удаление ненужных импортов";
        var rplce = "ctr + alt + n - заменяем переменную на ее значение везде";
        var q = "ctr + q - документация обо всем";
        var zakladka = "ctr + f11 - закладка"; //todo Roman see it




        var q = 1;
        var w = 2;
        var e = q + w;
        int i = q + w;
        var r = q + i;
        int i1 = q - w;
        for (int i2 = 0; i2 < 1; i2++) {

        }
        for (int i2 = 0; i2 < 3; i2++) {

        }

    }
}
