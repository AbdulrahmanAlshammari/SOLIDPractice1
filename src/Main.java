interface Workable {
    void work();
}

interface Readable{

    void read();
}

// hey its mohammad2
interface Eatable {
    void eat();
}

interface actions {
    void hit();
}

class HumanWorker implements actions {

interface Chargable {
    void charge();
}
class HumanWorker implements Workable {
    public void work() {
        System.out.println("Human working...");
    }

    public void eat() {
        System.out.println("Human eating...");
    }

    @Override
    public void hit() {
        System.out.println("human hitting...");
    }

}

class RobotWorker implements Workable, Chargable {
    public void work() {
        System.out.println("Robot working...");
    }
    public void read(){
        System.out.println("Robot Readable...");


    public void charge() {
        System.out.println("Robot Charging...");
    }
}

public class Main {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();
        robot.charge();
        // robot.eat(); // This method doesn't exist for RobotWorker, as it should be.
    }

}
