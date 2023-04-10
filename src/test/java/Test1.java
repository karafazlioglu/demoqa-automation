import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Mustafa");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[placeholder='name@example.com']"));
        email.click();
        email.sendKeys("mustafa123@gmail.com");

        WebElement address = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        address.click();
        address.sendKeys("İstanbul/Ataşehir");

        WebElement permanentAddress = driver.findElement(new By.ByCssSelector(".form-control[id='permanentAddress']"));
        permanentAddress.click();
        permanentAddress.sendKeys("İstanbul/Ataşehir");

        WebElement button = driver.findElement(new By.ByCssSelector("button.btn"));
        button.click();






    }
}
