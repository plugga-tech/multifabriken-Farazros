public class Vehicle {
    private String regNumber;
    private String color;
    private String brand;

    public Vehicle(String regNumber, String color, String brand){
        this.regNumber = regNumber;
        this.color = color;
        this.brand = brand;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
