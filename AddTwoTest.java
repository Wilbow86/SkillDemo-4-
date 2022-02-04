import static org.junit.Assert.*;
import org.junit.*;

public class AddTwoTest{

    @Test
    public void testAdd(){
        assertEquals(AddTwo.add(2, 3), 6);
    }
}