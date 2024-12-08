import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        assertEquals(true, StringUtils.isPalindrome("madam"));
        assertEquals(false, StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testCountVowels() {
        assertEquals(3, StringUtils.countVowels("hello"));
    }

    @Test
    public void testCountConsonants() {
        assertEquals(2, StringUtils.countConsonants("hello"));
    }

    @Test
    public void testCountWordOccurrences() {
        assertEquals(2, StringUtils.countWordOccurrences("hello hello world", "hello"));
    }
}
