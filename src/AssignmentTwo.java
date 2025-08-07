public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // Part 3: Adding and removing visitors from the ride queue
        assignment.partFourA(); // Part 4A: Adding visitors to ride history and checking their presence
        assignment.partFourB(); // Part 4B: Adding visitors to ride history and sorting them
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
        Visitor visitor1 = new Visitor("Anna", "Female", "0421 111 111", "T010", "Excitement");
        Visitor visitor2 = new Visitor("Ben", "Male", "0432 222 222", "T011", "Fun");
        Visitor visitor3 = new Visitor("Cara", "Female", "0443 333 333", "T012", "Thrill");
        Visitor visitor4 = new Visitor("Dan", "Male", "0454 444 444", "T013", "Challenge");
        Visitor visitor5 = new Visitor("Ella", "Female", "0465 555 555", "T014", "Adventure");

        cosmicTwist.printRideHistory();

        // Add them to ride history
        cosmicTwist.addVisitorToHistory(visitor1);
        cosmicTwist.addVisitorToHistory(visitor2);
        cosmicTwist.addVisitorToHistory(visitor3);
        cosmicTwist.addVisitorToHistory(visitor4);
        cosmicTwist.addVisitorToHistory(visitor5);

        cosmicTwist.printRideHistory();

        // Check if a visitor is in history
        cosmicTwist.checkVisitorFromHistory(visitor4); // Should be found

        // Get total number of visitors
        cosmicTwist.numberOfVisitors();

        // Print ride history
        cosmicTwist.printRideHistory();

    }

    public void partFourB() {
        // Create an Employee (name, gender, phone, id, department)
        Employee operator = new Employee("Sally", "Female", "0412 345 678", "E789", "Ride Manager");

        // Create a Ride (name, duration in seconds, thrillLevel, operator)
        Ride ride = new Ride("Green Lantern Coaster", 135, 5, operator);

        // Create 5 Visitors (name, gender, phone, tokenNumber, visitDetail)
        Visitor v1 = new Visitor("Mona", "Female", "0401 222 333", "T120", "Fun");
        Visitor v2 = new Visitor("Zara", "Female", "0403 334 445", "T115", "Excitement");
        Visitor v3 = new Visitor("Alex", "Male", "0405 556 667", "T140", "Adventure");
        Visitor v4 = new Visitor("Liam", "Male", "0407 778 889", "T110", "Challenge");
        Visitor v5 = new Visitor("Ben", "Male", "0409 990 001", "T135", "Thrill");

        // Add to ride history
        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        // Print before sorting
        System.out.println("\n--- Ride History BEFORE Sorting ---");
        ride.printRideHistory();

        // Sort visitors (using RideVisitorComparator)
        ride.sortRideHistory();

        // Print after sorting
        System.out.println("\n--- Ride History AFTER Sorting ---");
        ride.printRideHistory();
    }


    public void partFive() {
        Employee operator = new Employee("Cummins", "Male", "0412 123 456", "E104", "Ride Captain");
        Ride ride = new Ride("Martin Guptil", 145, 4, operator); // maxRider = 4

        String[] names = {"Maria", "Lachlan", "David", "Jack", "JhonSon", "Noah", "Erin", "Chili", "Wood", "Gree"};
        String[] genders = {"Female", "Male", "Female", "Male", "Female", "Male", "Female", "Male", "Female", "Male"};
        String[] phones = {"0412 234 111", "0423 555 222", "0434 666 333", "0455 777 444", "0466 888 555", 
                        "0477 999 666", "0488 000 777", "0499 111 888", "0400 222 999", "0411 333 000"};
        String[] addresses = { "Albarta","Darwin","Rockhampton","Bendigo","Toowoomba","Mackay","Shepparton","Launceston","Mildura","Coffs Harbour"};


        for (int i = 0; i < 10; i++) {
            Visitor visitor = new Visitor(
                names[i],
                genders[i],
                phones[i],
                "A2" + String.format("%02d", i + 1),
                "Enjoyment in " + addresses[i]
            );
            ride.addVisitorToQueue(visitor);
        }

        System.out.println("\n--- Queue BEFORE running the cycle ---");
        ride.printQueue();

        System.out.println("\n--- Running one ride cycle ---");
        ride.runOneCycle();

        System.out.println("\n--- Queue AFTER one cycle ---");
        ride.printQueue();

        System.out.println("\n--- Ride History AFTER one cycle ---");
        ride.printRideHistory();
    }


    public void partSix() {
    }

    public void partSeven() {
    }
}
