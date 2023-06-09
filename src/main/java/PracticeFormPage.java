import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//                      https://www.youtube.com/watch?v=J8ipfrXVfAY&list=PLdcqyXSQj-QaQN1hW0CiOnaG_WrNRU8tn

public class PracticeFormPage
{
    private WebDriver driver;
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By EMail = By.id("userEmail");
    private final By gender = By.xpath("//label[@for='gender-radio-1']");
    private final By gender2 = By.id("gender-radio-1");


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
    public void setGender()
    {
        WebElement genderButton = driver.findElement(gender);
        genderButton.click();
        System.out.println("Clicked yesRadio button.");
//        if (isEnabled){
//            genderButton.click();
//            System.out.println("Clicked yesRadio button.");
//        }
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
    public boolean getGender()
    {
        WebElement genderButton2 = driver.findElement(gender2);
        return genderButton2.isSelected();
    }
}
