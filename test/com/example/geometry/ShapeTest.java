import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle(4, 5);
        assertEquals(10.0, triangle.calculateArea());
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20.0, rectangle.calculateArea());
    }

    @Test
    public void testSquareArea() {
        Square square = new Square(4);
        assertEquals(16.0, square.calculateArea());
    }

    @Test
    public void testRhombusArea() {
        Rhombus rhombus = new Rhombus(6, 8);
        assertEquals(24.0, rhombus.calculateArea());
    }
}
