public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // Part 3: Adding and removing visitors from the ride queue
    }

    public void partThree() {
        Employee operatorInCharge = new Employee("Luna", "Female", "0400123456", "EMP007", "Operations Manager");
        Ride cosmicTwist = new Ride("Cosmic Twist", 150, 4, operatorInCharge);

        Visitor guest1 = new Visitor("Noah", "Male", "0411000001", "G001", "Excitement");
        Visitor guest2 = new Visitor("Mia", "Female", "0411000002", "G002", "Family Fun");
        Visitor guest3 = new Visitor("Ethan", "Male", "0411000003", "G003", "Splash Zone");
        Visitor guest4 = new Visitor("Isla", "Female", "0411000004", "G004", "Thrill Seeker");
        Visitor guest5 = new Visitor("Lucas", "Male", "0411000005", "G005", "Speed");

        cosmicTwist.printQueue();
        cosmicTwist.addVisitorToQueue(guest1);
        cosmicTwist.addVisitorToQueue(guest2);
        cosmicTwist.addVisitorToQueue(guest3);
        cosmicTwist.addVisitorToQueue(guest4);
        cosmicTwist.addVisitorToQueue(guest5);

        cosmicTwist.printQueue();
        cosmicTwist.removeVisitorFromQueue();
        cosmicTwist.printQueue();



    }

    public void partFourA() {
    }

    public void partFourB() {
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
