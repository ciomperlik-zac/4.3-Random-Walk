public class Collisions {
    public static void main(String[] args){
        RandomWalk walk1 = new RandomWalk(-3, 0, 2000000, 100000);
        RandomWalk walk2 = new RandomWalk(3, 0, 2000000, 100000);

        int numCollisions = 0;

        while (walk1.moreSteps() && walk1.inBounds() && walk2.moreSteps() && walk2.inBounds()) {
            walk1.takeStep();
            walk2.takeStep();

            if (samePosition(walk1, walk2)) {
                numCollisions++;
            }
        }

        System.out.println(String.format("Number of collisions: %d", numCollisions));
    }

    public static boolean samePosition (RandomWalk w1, RandomWalk w2) {
        return w1.getX() == w2.getX() && w1.getY() == w2.getY();
    }
}
