import org.testng.annotations.Test;

public class BasicTest {
    @Test
    public void testA(){
        System.out.println("Apple");
    }
    @Test
    public void testZ(){
        System.out.println("Zebra");
    }
    @Test
    public void testP(){
        System.out.println("Parrot");
    }
    @Test
    public void testQ(){
        System.out.println("Queen");
    }
    //Order of execution is alphabetical
}
