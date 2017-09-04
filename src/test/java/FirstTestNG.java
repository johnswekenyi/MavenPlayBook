import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class FirstTestNG {

    @BeforeMethod //Executes before each method
    public void UserIdGeneration(){
        System.out.println("User ID generation");
    }

    @BeforeTest
    public void DeleteCookies(){
        System.out.println("This block executes before all tests");
    }

    @Test
    public void AOpenBrowser(){

        System.out.println("Test open browser");
    }
    @Test
    public void BFlightBooking(){

        System.out.println("I am booking my flight today");
    }
    @AfterTest
    public void DeletingCookiesAfterComletingTests(){

        System.out.println("This block executes after all tests");
    }
    @AfterMethod
    public void RunAfterEachMethod(){

        System.out.println("This method executes after each method");
    }
}
