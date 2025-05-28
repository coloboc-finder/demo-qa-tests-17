package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @Test
    void fillFormTest() {
        open("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/");
        $("button[ng-click='manager()']").click();
        $("button[ng-click='addCust()']").click();
        $("input[ng-model='fName']").setValue("Ivan");
        $("input[ng-model='lName']").setValue("Ivanov");
        $("input[ng-model='postCd']").setValue("123456");
        $("button[type='submit']").click();

//        open("https://demoqa.com/text-box");
//        // Ожидаем, что заголовок страницы будет видим
//        $(".main-header").shouldHave(text("Text Box"));
//
//        // Заполняем поля
//        $("#userName").setValue("Ivan Ivanov");
//        $("#userEmail").setValue("ivanivanov@mail.com");
//        $("#currentAddress").setValue("Ivanovo 1");
//        $("#permanentAddress").setValue("Ivanovo 2");
//
//        // Нажимаем на кнопку отправки
//        $("#submit").click();
//
//        // Ожидаем, что вывод будет видим
//        $("#output").shouldBe(visible);
    }
}
