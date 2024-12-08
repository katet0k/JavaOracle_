import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthConverterTest {

    @Test
    public void testToMillimeters() {
        LengthConverter converter = new LengthConverter();
        assertEquals(1000.0, converter.toMillimeters(1, "m"));
        assertEquals(10000.0, converter.toMillimeters(1, "dm"));
        assertEquals(1000000.0, converter.toMillimeters(1, "km"));
    }
}
