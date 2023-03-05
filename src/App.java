public class App {
    private String street1;
    private String street2;
    private String street3;

    public App() {
        this("Bhubaneswar", "Berhampur", "cuttack");
    }

    public App(String street1, String street2, String street3) {
        this.street1 = street1;
        this.street2 = street2;
        this.street3 = street3;
    }

    public App(Address other) {
        this(other.street1, other.street2, other.street3);
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getStreet3() {
        return street3;
    }

    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    @Override
    public String toString() {
        return street1 + ", " + street2 + ", " + street3;
    }
}
