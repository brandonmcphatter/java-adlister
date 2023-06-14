import java.util.Arrays;

public class Pizza {
    String crust;
    String sauce;
    String pieSize;
    String[] toppings;
    String address;

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getPieSize() {
        return pieSize;
    }

    public void setPieSize(String pieSize) {
        this.pieSize = pieSize;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "\n*New Order*" +
                "\nSize: " + pieSize +
                "\nCrust: " + crust +
                "\nSauce: " + sauce +
                "\nToppings: " + Arrays.toString(toppings) +
                "\nAddress: " + address;
    }
}
