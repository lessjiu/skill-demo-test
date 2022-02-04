import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtractTest() {
        assertEquals(10, SkillDemo.subtract(1, 11)); //should fail
    }
}
