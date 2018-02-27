import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ParseEgeCalc {
    private static final String URL = "http://egecalc.ru/?rus=100&mat=100" +
            "&soc=100&phy=100&his=100&bio=100&che=100&lan=100&ict=100&geo=100" +
            "&lit=100&sort_by=salary&city=all&page=1";

    public static void Parser(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        WebElement element = driver.findElement(By.name("rus"));
        WebElement element1 = driver.findElement(By.name("mat"));
        WebElement element2 = driver.findElement(By.name("soc"));
        WebElement element3 = driver.findElement(By.name("phy"));
        WebElement element4 = driver.findElement(By.name("his"));
        WebElement element5 = driver.findElement(By.name("bio"));
        WebElement element6 = driver.findElement(By.name("che"));
        WebElement element7 = driver.findElement(By.name("lan"));
        WebElement element8 = driver.findElement(By.name("ict"));
        WebElement element9 = driver.findElement(By.name("geo"));
        WebElement element10 = driver.findElement(By.name("lit"));


        element.sendKeys("100");
        element1.sendKeys("100");
        element2.sendKeys("100");
        element3.sendKeys("100");
        element4.sendKeys("100");
        element5.sendKeys("100");
        element6.sendKeys("100");
        element7.sendKeys("100");
        element8.sendKeys("100");
        element9.sendKeys("100");
        element10.sendKeys("100");
        element.submit();
        element1.submit();
        element2.submit();
        element3.submit();
        element4.submit();
        element5.submit();
        element6.submit();
        element7.submit();
        element8.submit();
        element9.submit();
        element10.submit();

        List<WebElement> el = driver.findElements(By.className("card-block"));
        List<WebElement> elBM = el.get(0).findElements(By.className("card-digits"));
        List<WebElement> elDD = el.get(0).findElements(By.className("card-text"));
        List<WebElement> elUF = el.get(2).findElements(By.tagName("a"));
        System.out.println(elUF.get(0).getText());
    }


}
