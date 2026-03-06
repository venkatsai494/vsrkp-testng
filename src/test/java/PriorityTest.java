import org.testng.annotations.Test;

public class PriorityTest {
    @Test (priority = 1)
    public void intialize(){
        System.out.println("Initializing the test");
    }
    @Test (priority = 2)
    public void login(){
        System.out.println("Login the test");
    }
    @Test (priority = 3)
    public void close(){
        System.out.println("Closing the test");
    }

}
