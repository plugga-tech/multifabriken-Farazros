import java.util.ArrayList;
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
            int alternativ = scanner.nextInt();
            scanner.nextLine();

            switch (alternativ) {
                case 1:
                    System.out.println("Du har valt att beställa en bil");
                    break;
                case 6:
                    System.out.println("Programmet avslutas.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ogiltigt val.");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("Välj ett alternativ:");
        System.out.println("1. Beställa bil");
        System.out.println("2. Beställa godis");
        System.out.println("3. Beställa rör");
        System.out.println("4. Beställa havremjölk");
        System.out.println("5. Lista dina beställningar");
        System.out.println("6. Avsluta programmet");
    }
}
