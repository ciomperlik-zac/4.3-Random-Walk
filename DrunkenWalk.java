import java.util.Scanner;

public class DrunkenWalk {
    public static void drunkenMain() {
        int drunksFallen = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter boundary size: ");
        int size = scan.nextInt();
        System.out.print("Enter max steps: ");
        int max = scan.nextInt();
        System.out.print("Enter the number of drunks: ");
        int drunks = scan.nextInt();
        scan.close();

        for (int i = 0; i < drunks; i++) {
            RandomWalk drunk = new RandomWalk(size, max);
            drunk.walk();

            if (!drunk.inBounds()) {
                drunksFallen ++;
            }
        }

        System.out.println(String.format("Drunks fallen: %d", drunksFallen));
    }
}
