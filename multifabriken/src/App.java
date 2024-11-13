import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej, välkommen till Multifabriken!");

        //Loopar huvudmenyn
        while (true) {
            showMenu();
            System.out.print("Ange ditt val: ");
            int alternativ = getIntInput(scanner);

            switch (alternativ) {
                case 1:
                    orderVehicle(scanner);
                    break;
                case 2:
                    orderCandy(scanner);
                    break;
                case 3:
                    orderPipe(scanner);
                    break;
                case 4:
                    orderOatMilk(scanner);
                    break;
                case 5:
                    listOrders();
                    break;
                case 6:
                    System.out.println("Programmet avslutas.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
                    break;
            }
        }
    }

    //Metod för felinmatning vid int.
    private static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ange ett heltal.");
                scanner.nextLine();
            }
        }
    }

    //Metod för felinmatning vid double.
    private static double getDoubleInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ange ett heltal eller decimaltal.");
                scanner.nextLine();
            }
        }
    }

    //Huvudmenyn.
    private static void showMenu() {
        System.out.println("\nVälj ett alternativ:");
        System.out.println("1. Beställ en bil");
        System.out.println("2. Beställ godis");
        System.out.println("3. Beställ ett rör");
        System.out.println("4. Beställ havremjölk");
        System.out.println("5. Lista dina beställningar");
        System.out.println("6. Avsluta programmet");
    }

    //Bilbeställning
    private static void orderVehicle(Scanner scanner) {
        scanner.nextLine(); //Förhindrar programmet från att ställa 2 frågor åt gången
        System.out.println("Ange bilens registreringsnummer:");
        String regNumber = scanner.nextLine();
        System.out.println("Ange bilens färg:");
        String color = scanner.nextLine();
        System.out.println("Ange bilmärke:");
        String brand = scanner.nextLine();
    //Lägger till i Product Arraylist
        products.add(new Vehicle(regNumber, color, brand));
        System.out.println("Du har beställt en bil.");
    }

    //Godisbeställning
    private static void orderCandy(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ange smak:");
        String flavor = scanner.nextLine();
        System.out.println("Ange antal:");
        int quantity = getIntInput(scanner);
        // Lägger till i Product ArrayList
        products.add(new Candy(flavor, quantity));
        System.out.println("Du har beställt godis.");
    }

    //Rörbeställning
    private static void orderPipe(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ange diameter:");
        double diameter = getDoubleInput(scanner);
        System.out.println("Ange längd:");
        double length = getDoubleInput(scanner);
        // Lägger till i Product ArrayList
        products.add(new Pipe(diameter, length));
        System.out.println("Du har beställt ett rör.");
    }    

    //Havremjölksbeställning
    private static void orderOatMilk(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ange fetthalt:");
        double fat = getDoubleInput(scanner);
        System.out.println("Ange litermängd:");
        double liter = getDoubleInput(scanner);
        // Lägger till i Product ArrayList
        products.add(new OatMilk(fat, liter));
        System.out.println("Du har beställt havremjölk.");
    }    

    //Alla beställningar.
    private static void listOrders() {
        System.out.println("\nLista över alla beställningar:");
        for (Product products : products) {
            products.printDetails();
        }
    }
}