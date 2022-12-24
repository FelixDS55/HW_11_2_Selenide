package qa.guru;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragDropTest {

    @Test
    void dragAndDropTestElement(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Configuration.holdBrowserOpen = true;
        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(Condition.text("B"));
    }

    @Test
    void dragAndDropTestActions(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Configuration.holdBrowserOpen = true;
        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        actions().dragAndDropBy($("#column-a"), 150, 0).perform();
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(150,0).release().perform();
    }



}
