import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public void testAdd() {
        assertEquals(15, Addition.add(5, 10));
        assertEquals(0, Addition.add(0, 0));
        assertEquals(-5, Addition.add(-10, 5));
    }
}
