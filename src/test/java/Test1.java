import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

      //  driver.get("https://demoqa.com/text-box");
     //   driver.manage().window().maximize();

      //  WebElement fullName = driver.findElement(By.id("userName"));
       // fullName.click();
       // fullName.sendKeys("Mustafa");

      //  WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[placeholder='name@example.com']"));
      //  email.click();
      //  email.sendKeys("mustafa123@gmail.com");

       // WebElement address = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
       // address.click();
       // address.sendKeys("İstanbul/Ataşehir");

       // WebElement permanentAddress = driver.findElement(new By.ByCssSelector(".form-control[id='permanentAddress']"));
      //  permanentAddress.click();
       // permanentAddress.sendKeys("İstanbul/Ataşehir");

       // WebElement button = driver.findElement(new By.ByCssSelector("button.btn"));
       // button.click();

        ////////////



       // WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
       // String name = nameText.getText();
       // System.out.println(name);

       // WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
       // String emailTextText = emailText.getText();
       // System.out.println(emailTextText);

        //driver.get("https://demoqa.com/checkbox");
        //driver.manage().window().maximize();

        //String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";
        //WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        //homeCheckBox.click();

        //homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));

        //String homeCheckboxClassName = homeCheckBox.getAttribute("class");

        //if (homeCheckboxClassName.equals("rct-icon rct-icon-check")){
        //    System.out.println("Checkbox is checked!");
        //}
        //else {
        //    System.out.println("Checkbox is unchecked!");
        //}


        ///////////////////


         driver.get("https://demoqa.com/automation-practice-form");
         driver.manage().window().maximize();

         WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
         boolean isEnabled = sportCheckbox.isEnabled();
         System.out.println(isEnabled);

        WebElement sportsCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        if (isEnabled){
            try {
                System.out.println("Entered try block!");
                sportCheckbox.click();
            }catch (ElementClickInterceptedException e){
                sportsCheckboxLabel.click();
                System.out.println("Entered catch block!");
            }
        }

        boolean isSelected = sportCheckbox.isSelected();
        System.out.println(isSelected);




    }
}
