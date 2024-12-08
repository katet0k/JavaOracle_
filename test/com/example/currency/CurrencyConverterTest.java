import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {

    @Test
    public void testConvertToUSD() {
        CurrencyConverter converter = new CurrencyConverter();
        assertEquals(110.0, converter.convertToUSD(100, "EUR"));
        assertEquals(130.0, converter.convertToUSD(100, "GBP"));
        assertEquals(0.9, converter.convertToUSD(100, "JPY"));
        assertEquals(100.0, converter.convertToUSD(100, "USD"));
    }
}
