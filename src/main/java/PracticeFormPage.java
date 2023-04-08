import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage
{
    private WebDriver driver;
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By EMail = By.id("userEmail");

    public PracticeFormPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setName(String nameAsString)
    {
        WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);

    }
    public void setLastName(String lastNameAsString)
    {
        WebElement lastNameSpace = driver.findElement(lastName);
        lastNameSpace.click();
        lastNameSpace.sendKeys(lastNameAsString);

    }
    public void setEMail(String EMailAsString)
    {
        WebElement eMailSpace = driver.findElement(EMail);
        eMailSpace.click();
        eMailSpace.sendKeys(EMailAsString);

    }
    public String getName()
    {
        WebElement nameSpace = driver.findElement(name);
        return nameSpace.getAttribute("value");
    }

    public String getLastName()
    {
        WebElement lastNameSpace = driver.findElement(lastName);
        return lastNameSpace.getAttribute("value");
    }

    public String getEMail()
    {
        WebElement eMAilSpace = driver.findElement(EMail);
        return eMAilSpace.getAttribute("value");
    }
}
