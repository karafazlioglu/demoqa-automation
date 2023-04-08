import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_EMail extends Base_test
{
    @Test
    public void setName()
    {
        practiceFormPage.setName("Mustafa");
        Assertions.assertEquals("Mustafa",practiceFormPage.getName(), "Name value is not correct!");

    }
    @Test
    public void setLastName()
    {
        practiceFormPage.setLastName("Aksu");
        Assertions.assertEquals("Aksu",practiceFormPage.getLastName(), "Name value is not correct!");

    }
    @Test
    public void setEMail()
    {
        practiceFormPage.setEMail("mustafa123@gmail.com");
        Assertions.assertEquals("mustafa123@gmail.com",practiceFormPage.getEMail(), "Name value is not correct!");

    }

}
