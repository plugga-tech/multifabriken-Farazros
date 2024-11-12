import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static ArrayList<Candy> candies = new ArrayList<>();
    private static ArrayList<Pipe> pipes = new ArrayList<>();
    private static ArrayList<OatMilk> oatMilks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej, välkommen till Multifabriken!");

        while (true) {
            showMenu();

            System.out.print("Ange ditt val: ");
            int alternativ;

            //Fångar felinmatningar.
            try {
                alternativ = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ogiltigt val. Välj mellan alternativen 1-6.");
                scanner.nextLine();
                continue;
            }

            switch (alternativ) {
                case 1:
                    orderVehicle(scanner);
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

    //Huvudmenyn.
    private static void showMenu() {
        System.out.println("Välj ett alternativ:");
        System.out.println("1. Beställa bil");
        System.out.println("2. Beställa godis");
        System.out.println("3. Beställa rör");
        System.out.println("4. Beställa havremjölk");
        System.out.println("5. Lista dina beställningar");
        System.out.println("6. Avsluta programmet");
    }

    private static void orderVehicle(Scanner scanner) {
        System.out.println("Ange bilens registreringsnummer:");
        String regNumber = scanner.nextLine();
        System.out.println("Ange bilens färg:");
        String color = scanner.nextLine();
        System.out.println("Ange bilmärke:");
        String brand = scanner.nextLine();

        Vehicle vehicle = new Vehicle(regNumber, color, brand);
        vehicles.add(vehicle);
        System.out.println("Bil beställd: Registreringsnummer: " + vehicle.getRegNumber()
         + ", Färg: " + vehicle.getColor() + ", Bilmärke: " + vehicle.getBrand());
    }

    //Alla beställningar.
    private static void listOrders() {
        //Beställda bilar
        System.out.println("\nLista över alla beställda bilar:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Registreringsnummer: " + vehicle.getRegNumber() 
            + ", Färg: " + vehicle.getColor() 
            + ", Bilmärke: " + vehicle.getBrand());
        }
    }
}