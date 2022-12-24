package qa.guru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestGit extends TestBase {
    @Test
    void searchTest(){
        $(".list-style-none").find(byText("Solutions")).hover();
        $(".list-style-none").find(byText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));
    }
}
