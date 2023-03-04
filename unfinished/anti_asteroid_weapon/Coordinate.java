package unfinished.anti_asteroid_weapon;

public class Coordinate {
    // attributes
    private int x;
    private int y;

    // constructor
    public Coordinate(int xArg, int yArg) {
        x = xArg;
        y = yArg;
    }

    // getters 
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public double getDistance() {
        return Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
    }

    public String toString() {
        return String.format("%d %d", x, y);
    }
}
