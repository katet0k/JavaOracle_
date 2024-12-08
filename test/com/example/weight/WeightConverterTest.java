import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightConverterTest {

    @Test
    public void testToMilligrams() {
        WeightConverter converter = new WeightConverter();
        assertEquals(1000.0, converter.toMilligrams(1, "g"));
        assertEquals(1000000.0, converter.toMilligrams(1, "kg"));
        assertEquals(100000000.0, converter.toMilligrams(1, "q"));
        assertEquals(1000000000.0, converter.toMilligrams(1, "t"));
    }
}
