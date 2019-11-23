package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

import static org.hamcrest.core.Is.is;

public class SeleniumTest {
    // visi testai rasomi funkcijom
    private  WebDriver driver;
    @Before // nurodo metodu vykdymo tvarka, before - pries vykdant testa
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testTodayDate(){
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\test\\resources\\driver\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();          // apsirasem pra
        //given
        driver.get("https://delfi.lt");                 //paleis narsykle su puslapiu, su draiverio pagalba nueinam i tinklapi
        //when
        WebElement title = driver.findElement(By.className("header-date")); // mes susikuriam elementa, pagal header.date. su F12 galima iskviesti dev tools, susirandam
        //then
        Assert.assertThat(title.getText(), is("Lapkričio 17 d., sekmadienis")); // ir tada tikrinu ar jisai turi tokia reiksme, jei viskas ok testas pass
       // driver.close();                                   //uzdaro chrome
    }
    @After // kai testas baigiasi ivykdyk sita veiksma
    public void unMount(){
        driver.close();
    }
}
