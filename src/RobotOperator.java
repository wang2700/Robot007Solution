import java.lang.System;

public class RobotOperator {
    public static void main(String [] args) {
        Robot007 robot = new Robot007("Iron Man", 0, 0, 0);

        System.out.println(robot.getName() + " starts working!");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        robot.moveForward(10);
        System.out.println("Moving forward...");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        robot.rotateLeft(90);
        System.out.println("Rotating left...");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        robot.moveBackward(20);
        System.out.println("Moving backward...");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        robot.rotateRight(135);
        System.out.println("Rotating right...");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        robot.moveForward(30);
        System.out.println("Moving forward...");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        robot.teleport(0, 0);
        System.out.println("Teleporting...");
        System.out.println("Position: (" + robot.getX() + "," + robot.getY() + ")");
        System.out.println("Orientation angle: " + robot.getOrient());
        System.out.println("Warning! No energy! Stop working...Bye bye!");
    }
}