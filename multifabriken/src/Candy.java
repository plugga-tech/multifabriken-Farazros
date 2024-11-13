public class Candy extends Product{
    private String flavor;
    private int quantity;

    public Candy(String flavor, int quantity) {
        this.flavor = flavor;
        this.quantity = quantity;
    }

    @Override
    public void printDetails() {
        System.out.println("\nGodis:");
        System.out.println("Smak: " + flavor);
        System.out.println("Antal: " + quantity);
    }
}
