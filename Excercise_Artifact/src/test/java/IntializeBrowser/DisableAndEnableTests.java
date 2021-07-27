package IntializeBrowser;
import org.testng.annotations.Test;

public class DisableAndEnableTests
{
    // This test will be executed as the enabled property is true.
    @Test(enabled=true)
    public void firstTest()
    {
        System.out.println("In First Test");
    }
     
    // This test will NOT be executed as the enabled property is false.
   @Test(enabled=false)
    public void secondTest()
    {
        System.out.println("In Second Test");
    }
     
    // This test will NOT be executed as the enabled property is false.
   @Test(enabled=false)
    public void thirdTest()
    {
        System.out.println("In Third Test");
    }
}