public class Vehicle extends Product{
    private String regNumber;
    private String color;
    private String brand;

    public Vehicle(String regNumber, String color, String brand){
        this.regNumber = regNumber;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public void printDetails() {
        System.out.println("Bil:");
        System.out.println("Registreringsnummer: " + regNumber);
        System.out.println("Färg: " + color);
        System.out.println("Märke: " + brand);
    }
}
