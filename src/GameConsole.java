public class GameConsole {
    private final String brand;
    private final String serial;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn = false;

    public GameConsole(String brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(brand, 1);
        this.secondGamepad = new Gamepad(brand, 2);
    }

    public String getBrand() { return brand; }
    public String getSerial() { return serial; }
    public boolean isOn() { return isOn; }

    public void powerOn() {
        isOn = true;
        System.out.println("Консоль увімкнена.");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Консоль вимкнена.");
    }

    public class Gamepad {
        private final String brand;
        private final String consoleSerial;
        private final int connectedNumber;
        private double chargeLevel = 100.0;
        private boolean isOn = false;

        public Gamepad(String brand, int connectedNumber) {
            this.brand = brand;
            this.consoleSerial = GameConsole.this.serial;
            this.connectedNumber = connectedNumber;
        }

        public void powerOn() {
            isOn = true;
            System.out.println("Джойстик " + connectedNumber + " увімкнено.");
            GameConsole.this.powerOn();
        }

        public void powerOff() {
            isOn = false;
            System.out.println("Джойстик " + connectedNumber + " вимкнено.");
        }
    }
}
