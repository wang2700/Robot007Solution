import java.util.Random;

public class Robot007 {

    private String name;
    private double x;
    private double y;
    private double alpha;

    public Robot007 (String name, double x, double y, double alpha) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.alpha = alpha;
    }

    public void moveForward (double dist) {
        double alphaRad = alpha / 180.0 * Math.PI;
        x += dist * Math.cos(alphaRad);
        y += dist * Math.sin(alphaRad);
    }

    public void moveBackward (double dist) {
        double alphaRad = alpha / 180.0 * Math.PI;
        x -= dist * Math.cos(alphaRad);
        y -= dist * Math.sin(alphaRad);
    }

    public void rotateLeft (double angle) {
        alpha += angle;
        alpha %= 360;
    }

    public void rotateRight (double angle) {
        alpha += 360 - angle % 360;
        alpha %= 360;
    }

    public void teleport (double newX, double newY) {
        Random random = new Random();
        double r = random.nextDouble() * 5;
        double theta = random.nextDouble() * 2 * Math.PI;

        x = r * Math.cos(theta);
        y = r * Math.sin(theta);
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getOrient() {
        return alpha;
    }
}
