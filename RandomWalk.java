public class RandomWalk {
    private int x;
    private int y;
    private int size;
    private int max;
    private int taken;
    private int maxDistance;

    public RandomWalk(int size, int max) {
        x = 0;
        y = 0;
        this.size = size;
        this.max = max;
        taken = 0;
        maxDistance = 0;
    }

    public RandomWalk(int x, int y, int size, int max) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.max = max;
        taken = 0;
        maxDistance = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public boolean moreSteps() {
        return taken < max;
    }

    public boolean inBounds() {
        return Math.abs(x) <= size && Math.abs(y) <= size;
    }

    private int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public void takeStep() {
        switch ((int) Math.round(Math.random() * 3)) {
            case 0:
                x += 1;
            case 1:
                x -= 1;
            case 2:
                y += 1;
            case 3:
                y -= 1;
        }

        taken ++;

        maxDistance = max(maxDistance, max(Math.abs(x), Math.abs(y)));
    }

    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }

    public String toString() {
        return String.format("Steps: %d; Max Distance: %d; Position: (%d, %d)", taken, maxDistance, x, y);
    }
}
