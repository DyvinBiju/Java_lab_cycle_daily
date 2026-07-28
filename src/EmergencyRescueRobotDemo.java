// Task 3 - Emergency Rescue Robot
// Demonstrates Abstract Class, Interfaces and Multiple Inheritance

// Abstract Class
abstract class RescueRobot {

    protected int robotId;
    protected String robotName;

    public RescueRobot(int robotId, String robotName) {
        this.robotId = robotId;
        this.robotName = robotName;
    }

    // Concrete Method
    public void displayRobotDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Robot ID   : " + robotId);
        System.out.println("Robot Name : " + robotName);
    }

    // Concrete Method
    public void startRobot() {
        System.out.println("Robot is ready for rescue operation.");
    }

    // Abstract Method
    public abstract void performMission();
}

// Interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climbable {
    void climb();
}

// Drone Robot
class DroneRobot extends RescueRobot implements Flyable {

    public DroneRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying over disaster area.");
    }

    public void performMission() {
        System.out.println("Mission: Searching for survivors from the air.");
    }
}

// Water Rescue Robot
class WaterRescueRobot extends RescueRobot implements Swimmable {

    public WaterRescueRobot(int id, String name) {
        super(id, name);
    }

    public void swim() {
        System.out.println("Swimming through flooded area.");
    }

    public void performMission() {
        System.out.println("Mission: Rescuing people trapped in water.");
    }
}

// Mountain Rescue Robot
class MountainRescueRobot extends RescueRobot implements Climbable {

    public MountainRescueRobot(int id, String name) {
        super(id, name);
    }

    public void climb() {
        System.out.println("Climbing rocky mountains.");
    }

    public void performMission() {
        System.out.println("Mission: Assisting mountain rescue team.");
    }
}

// Multi Purpose Robot
class MultiPurposeRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    public MultiPurposeRobot(int id, String name) {
        super(id, name);
    }

    public void fly() {
        System.out.println("Flying to rescue location.");
    }

    public void swim() {
        System.out.println("Crossing flooded regions.");
    }

    public void climb() {
        System.out.println("Climbing obstacles.");
    }

    public void performMission() {
        System.out.println("Mission: Performing rescue in all terrains.");
    }
}

// Driver Class
public class EmergencyRescueRobotDemo {

    public static void main(String[] args) {

        // Using abstract class references
        RescueRobot[] robots = {

                new DroneRobot(101, "SkyEye"),
                new WaterRescueRobot(102, "AquaBot"),
                new MountainRescueRobot(103, "HillClimber"),
                new MultiPurposeRobot(104, "RescueX")

        };

        System.out.println("===== EMERGENCY RESCUE ROBOT SYSTEM =====\n");

        for (RescueRobot robot : robots) {

            robot.displayRobotDetails();
            robot.startRobot();
            robot.performMission();

            if (robot instanceof Flyable) {
                Flyable f = (Flyable) robot;
                f.fly();
            }

            if (robot instanceof Swimmable) {
                Swimmable s = (Swimmable) robot;
                s.swim();
            }

            if (robot instanceof Climbable) {
                Climbable c = (Climbable) robot;
                c.climb();
            }

            System.out.println();
        }
    }
}