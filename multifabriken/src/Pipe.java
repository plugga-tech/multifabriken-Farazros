public class Pipe extends Product{
    private double diameter;
    private double length;

    public Pipe(double diameter, double length) {
    this.diameter = diameter;
    this.length = length;
}

    @Override
    public void printDetails() {
        System.out.println("\nRör:");
        System.out.println("Diameter: " + diameter + " Ø");
        System.out.println("Längd: " + length);
    }
}
