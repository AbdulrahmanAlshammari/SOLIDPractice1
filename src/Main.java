interface Workable {
    void work();
}
interface Readable{

    void read();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable {
    public void work() {
        System.out.println("Human working...");
    }

    public void eat() {
        System.out.println("Human eating...");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot working...");
    }
    public void read(){
        System.out.println("Robot Readable...");
    }
}

public class Main {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();
        // robot.eat(); // This method doesn't exist for RobotWorker, as it should be.
    }

}
