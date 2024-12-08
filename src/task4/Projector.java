package task4;

public class Projector {
    private final String name;
    private final int year;
    private final double price;
    private final String brand;

    public Projector(String name, int year, double price, String brand) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return String.format("Projector{name='%s', year=%d, price=%.2f, brand='%s'}",
                name, year, price, brand);
    }
}
