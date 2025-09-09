import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomWalk walk = new RandomWalk(5, 10);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter boundary size: ");
        int size = scan.nextInt();
        System.out.print("Enter max steps: ");
        int max = scan.nextInt();
        scan.close();
        RandomWalk userWalk = new RandomWalk(size, max);

        System.out.println(walk);
        System.out.println(userWalk);
    }
}
