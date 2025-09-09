import java.util.Scanner;

public class DrunkenWalk {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter boundary size: ");
    int size = scan.nextInt();
    System.out.print("Enter max steps: ");
    int max = scan.nextInt();
    scan.close();
    RandomWalk userWalk = new RandomWalk(size, max);
}
