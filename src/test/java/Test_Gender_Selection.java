import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends Base_test
{
    @Test
    public void setGender()
    {
        practiceFormPage.setGender();
        Assertions.assertTrue(practiceFormPage.getGender(), "Gender box is not selected!");

    }

}
