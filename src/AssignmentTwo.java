public class AssignmentTwo {

    // Main method: Runs all parts sequentially
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // Part 3: Adding and removing visitors from the ride queue
        assignment.partFourA(); // Part 4A: Adding visitors to ride history and checking their presence
        assignment.partFourB(); // Part 4B: Adding visitors to ride history and sorting them
        assignment.partFive(); // Part 5: Running a ride cycle with multiple visitors
        assignment.partSix(); // Part 6: Exporting ride history to a file
        assignment.partSeven(); // Part 7: Importing ride history from a file and printing visitor details

    }

    // Part 3: Add and remove visitors from a ride queue
    public void partThree() {
        // Create employee for the ride
        Employee operatorInCharge = new Employee("Luna", "Female", "0400123456", "EMP007", "Operations Manager");

        // Create a ride
        Ride cosmicTwist = new Ride("Cosmic Twist", 150, 4, operatorInCharge);

        // Display queue before and after operations
        cosmicTwist.printQueue();
        // Add visitors to the queue
        cosmicTwist.addVisitorToQueue(new Visitor("Noah", "Male", "0411000001", "G001", "Excitement"));
        cosmicTwist.addVisitorToQueue(new Visitor("Mia", "Female", "0411000002", "G002", "Family Fun"));
        cosmicTwist.addVisitorToQueue(new Visitor("Ethan", "Male", "0411000003", "G003", "Splash Zone"));
        cosmicTwist.addVisitorToQueue(new Visitor("Isla", "Female", "0411000004", "G004", "Thrill Seeker"));
        cosmicTwist.addVisitorToQueue(new Visitor("Lucas", "Male", "0411000005", "G005", "Speed"));
        cosmicTwist.printQueue();
        cosmicTwist.removeVisitorFromQueue();
        cosmicTwist.printQueue();
    }

    // Part 4A: Add visitors to ride history and check presence
    public void partFourA() {
        // Create ride operator and ride
        Employee operatorInCharge = new Employee("Bob", "Male", "0412 345 678", "E456", "Ride Attendant");
        Ride cosmicTwist = new Ride("Batwing Spaceshot", 130, 4, operatorInCharge);

        // Print and add visitors to ride history
        cosmicTwist.printRideHistory();
        // Create a visitor to check

        Visitor visitorCheck = new Visitor("Angus Reid", "Male", "0412 234 432", "T602", "Outing");
        cosmicTwist.addVisitorToHistory(new Visitor("Matilda Grace", "Female", "0411 123 321", "T601", "Thrill Lover"));
        cosmicTwist.addVisitorToHistory(new Visitor("Chloe Nguyen", "Female", "0413 345 543", "T603", "Holiday"));
        cosmicTwist.addVisitorToHistory(visitorCheck);
        cosmicTwist.addVisitorToHistory(new Visitor("Hazel Brooks", "Female", "0415 567 765", "T605", "Just for Fun"));
        cosmicTwist.addVisitorToHistory(new Visitor("Finn Wallace", "Male", "0414 456 654", "T604", "School Break"));

        // Display and validate ride history
        System.out.println("\n--- Ride History after adding visitors ---");
        cosmicTwist.printRideHistory();
        // Check if a visitor is in history
        cosmicTwist.checkVisitorFromHistory(visitorCheck);
        // Get total number of visitors
        System.out.println("\nTotal number of visitors in ride history: " + cosmicTwist.numberOfVisitors());
        cosmicTwist.numberOfVisitors();
        // Print ride history
        System.out.println("\n--- Ride History after adding visitors ---");
        cosmicTwist.printRideHistory();
    }

    // Part 4B: Sort ride history after adding visitors
    public void partFourB() {
        // Create ride operator and ride
        Employee operatorInCharge = new Employee("Sally", "Female", "0412 345 678", "E789", "Ride Manager");
        Ride cosmicTwist = new Ride("Green Lantern Coaster", 135, 5, operatorInCharge);

        // Add unique visitors to the ride history

        // Add to history and display before and after sorting
        cosmicTwist.addVisitorToHistory(new Visitor("Amelia Kent", "Female", "0401 222 111", "T701", "Excitement"));
        cosmicTwist.addVisitorToHistory(new Visitor("Logan Price", "Male", "0402 333 222", "T702", "Curious"));
        cosmicTwist.addVisitorToHistory(new Visitor("Ivy Saunders", "Female", "0403 444 333", "T703", "Adventure"));
        cosmicTwist.addVisitorToHistory(new Visitor("Mason Doyle", "Male", "0404 555 444", "T704", "Ride Fan"));
        cosmicTwist.addVisitorToHistory(new Visitor("Layla Quinn", "Female", "0405 666 555", "T705", "Thrill"));

        // Print ride history before sorting
        System.out.println("\n--- Ride History BEFORE Sorting ---");
        cosmicTwist.printRideHistory();

        // Sort ride history
        System.out.println("\n--- Sorting Ride History ---");
        cosmicTwist.sortRideHistory();

        // Print ride history after sorting

        System.out.println("\n--- Ride History AFTER Sorting ---");
        cosmicTwist.printRideHistory();
    }

    // Part 5: Run a ride cycle with multiple visitors
    public void partFive() {
        // Create ride operator and ride
        Employee operatorInCharge = new Employee("Cummins", "Male", "0412 123 456", "E104", "Ride Captain");
        Ride cosmicTwist = new Ride("Martin Guptil", 145, 4, operatorInCharge);

        // Arrays of visitor info
        String[] names = { "Maria", "Lachlan", "David", "Jack", "JhonSon", "Noah", "Erin", "Chili", "Wood", "Gree" };
        String[] genders = { "Female", "Male", "Female", "Male", "Female", "Male", "Female", "Male", "Female", "Male" };
        String[] phones = { "0412 234 111", "0423 555 222", "0434 666 333", "0455 777 444", "0466 888 555",
                "0477 999 666", "0488 000 777", "0499 111 888", "0400 222 999", "0411 333 000" };
        String[] addresses = { "Albarta", "Darwin", "Rockhampton", "Bendigo", "Toowoomba", "Mackay",
                "Shepparton", "Launceston", "Mildura", "Coffs Harbour" };

        // Create and queue visitors
        for (int i = 0; i < 10; i++) {
            Visitor visitor = new Visitor(
                    names[i],
                    genders[i],
                    phones[i],
                    "A2" + String.format("%02d", i + 1),
                    "Enjoyment in " + addresses[i]);
            cosmicTwist.addVisitorToQueue(visitor);
        }

        // Run the ride cycle
        System.out.println("\n--- Queue BEFORE running the cycle ---");
        cosmicTwist.printQueue();

        System.out.println("\n--- Running one ride cycle ---");
        cosmicTwist.runOneCycle();

        System.out.println("\n--- Queue AFTER one cycle ---");
        cosmicTwist.printQueue();

        System.out.println("\n--- Ride History AFTER one cycle ---");
        cosmicTwist.printRideHistory();
    }

    // Part 6: Export ride history to a file
    public void partSix() {
        // Create ride operator and ride
        Employee operatorInCharge = new Employee("Chloe", "Female", "0412 345 678", "E888", "Safety Lead");
        Ride cosmicTwist = new Ride("Justice League Ride", 120, 3, operatorInCharge);

        // Add unique Australian visitors to history
        cosmicTwist.addVisitorToHistory(
                new Visitor("Harper Mitchell", "Female", "0400 321 654", "T801", "Adrenaline Seeker"));
        cosmicTwist.addVisitorToHistory(new Visitor("Cooper Hayes", "Male", "0401 432 765", "T802", "Family Day Out"));
        cosmicTwist
                .addVisitorToHistory(new Visitor("Ruby Anderson", "Female", "0402 543 876", "T803", "School Holiday"));
        cosmicTwist
                .addVisitorToHistory(new Visitor("Archie Murphy", "Male", "0403 654 987", "T804", "Rollercoaster Fan"));
        cosmicTwist.addVisitorToHistory(new Visitor("Zara Wilson", "Female", "0404 765 098", "T805", "Birthday Bash"));

        // Export the ride history to file
        cosmicTwist.exportRideHistory();
    }

    // Part 7: Import ride history and print visitor details
    public void partSeven() {
        // Create ride operator and ride
        Employee operatorInCharge = new Employee("Lara", "Female", "+61 412 345 678", "E1001", "Ride Supervisor");
        Ride cosmicTwist = new Ride("Superman Escape", 140, 5, operatorInCharge);

        System.out.println("<--------------- Adding Visitors to Ride History --------------->");
        // Add them to ride history
        cosmicTwist.addVisitorToHistory(new Visitor("Jack Thompson", "Male", "+61 400 111 222", "T001", "Adventure"));
        cosmicTwist.addVisitorToHistory(new Visitor("Emily Watson", "Female", "+61 400 333 444", "T002", "Birthday"));
        cosmicTwist.addVisitorToHistory(new Visitor("Oliver White", "Male", "+61 400 555 666", "T003", "Holiday Trip"));
        cosmicTwist.addVisitorToHistory(new Visitor("Sophie Lee", "Female", "+61 400 777 888", "T004", "Fun"));
        cosmicTwist.addVisitorToHistory(new Visitor("Liam Harris", "Male", "+61 400 999 000", "T005", "First Visit"));

        // Import from file (simulate merge or overwrite)
        cosmicTwist.importRideHistory();

        // Output total and visitor details
        System.out.println("\nTotal visitors imported: " + cosmicTwist.numberOfVisitors());
        System.out.println("\nImported Visitor Details:");
        cosmicTwist.printRideHistory();
    }
}
