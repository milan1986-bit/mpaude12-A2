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

        // Create Employee (name, gender, phone, id, department)
        Employee operatorInCharge = new Employee("Bob", "Male", "0412 345 678", "E456", "Ride Attendant");

        // Create Ride (name, duration, thrillLevel, operator)
        Ride cosmicTwist = new Ride("Batwing Spaceshot", 130, 4, operatorInCharge); 

        // Create 5 Visitors (name, gender, phone, tokenNumber, visitDetail)
        Visitor v1 = new Visitor("Anna", "Female", "0421 111 111", "T010", "Excitement");
        Visitor v2 = new Visitor("Ben", "Male", "0432 222 222", "T011", "Fun");
        Visitor v3 = new Visitor("Cara", "Female", "0443 333 333", "T012", "Thrill");
        Visitor v4 = new Visitor("Dan", "Male", "0454 444 444", "T013", "Challenge");
        Visitor v5 = new Visitor("Ella", "Female", "0465 555 555", "T014", "Adventure");



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
