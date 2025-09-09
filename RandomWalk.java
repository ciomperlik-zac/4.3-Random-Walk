public class RandomWalk {
    private int x;
    private int y;
    private int size;
    private int max;
    private int taken;

    public RandomWalk(int size, int max) {
        x = 0;
        y = 0;
        this.size = size;
        this.max = max;
        taken = 0;
    }

    public RandomWalk(int x, int y, int size, int max) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.max = max;
        taken = 0;
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
    }

    public boolean moreSteps() {
        return taken < max;
    }

    public boolean inBounds() {
        return Math.abs(x) <= size && Math.abs(y) <= size;
    }

    public void walk() {
        while (taken < max) {
            if (moreSteps() && inBounds()) {
                takeStep();
            }
            else {
                break;
            }
        }
    }

    public String toString() {
        return String.format("Steps: %d; Position: (%d, %d)", taken, x, y);
    }
}
