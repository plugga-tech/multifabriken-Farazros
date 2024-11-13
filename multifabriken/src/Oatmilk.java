public class OatMilk extends Product{
	private double fat;
	private double liter;
	
	public OatMilk(double fat, double liter) {
		this.fat = fat;
		this.liter = liter;
	}

	@Override
	public void printDetails() {
        System.out.println("\nHavremjölk:");
        System.out.println("Fetthalt: " + fat + " %");
        System.out.println("Litermängd: " + liter + " liter");
	}
}