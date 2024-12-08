package task3;

public class Device {
    private final String name;
    private final int year;
    private final double price;
    private final String color;
    private final String type;

    public Device(String name, int year, double price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
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

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Device{name='%s', year=%d, price=%.2f, color='%s', type='%s'}",
                name, year, price, color, type);
    }
}
