import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String name;
    private int duration;
    private int thrillLevel;
    private Employee operator;

    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideLogs;

    public Ride() {

    }

    public Ride(String name, int duration, int thrillLevel, Employee operator) {
        this.name = name;
        this.duration = duration;
        this.thrillLevel = thrillLevel;
        this.operator = operator;
    }
    public String getName() {
         return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public int getDuration() { 
        return duration; 
    }
    public void setDuration(int duration) { 
        this.duration = duration; 
    }

    public Employee getOperator() { 
        return operator; 
    }
    public void setOperator(Employee operator) { 
        this.operator = operator; 
    }

    @Override
    public void printQueue() {

        System.out.println("<--------------- Current Waiting Line --------------->");

        if (waitingLine.isEmpty()) {
            System.out.println("[INFO] The queue is currently empty.");
        } else {
            System.out.println("========== Waiting Line ==========");
            int position = 1;
            for (Visitor g : waitingLine) {
                System.out.println(position++ + ". Name: " + g.getName()
                    + " | Gender: " + g.getGender()
                    + " | Phone Number: " + g.getPhone()
                    + " | Token Number: " + g.getTokenNumber()
                    + " | Visit Detail: " + g.getVisitDetail());
            }
            System.out.println("==================================");
        }
        
    }
    
    @Override
    public void addVisitorToQueue(Visitor visit) {
        System.out.println("<--------------- Adding a guest to the waiting line --------------->");
        if (visit != null) {
            waitingLine.add(visit);
            System.out.println("Guest " + visit.getName() + " added to the waiting line.");
        } else {
            System.out.println("Invalid guest.");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        System.out.println("<--------------- Removing a guest from the waiting line --------------->");
        if (!waitingLine.isEmpty()) {
            Visitor removed = waitingLine.poll();
            System.out.println("Guest " + removed.getName() + " removed from the waiting line.");
        } else {
            System.out.println("No guests in the waiting line.");
        }
    }
       
    
    @Override
    public void runOneCycle() {

    }

    @Override
    public void printRideHistory() {

        System.out.println("<--------------- Ride Participation History --------------->");

        if (rideLogs.isEmpty()) {
            System.out.println("[INFO] No guests have taken this ride yet.");
            return;
        }

        System.out.println("======== Ride Participation History ========");
        int index = 1;
        Iterator<Visitor> iterator = rideLogs.iterator();
        while (iterator.hasNext()) {
            Visitor guest = iterator.next();
            System.out.println(index++ + ". Name: " + guest.getName()
                + " | Gender: " + guest.getGender()
                + " | Phone Number: " + guest.getPhone()
                + " | Token Number: " + guest.getTokenNumber());
        }
        System.out.println("============================================");
    }

     @Override
    public int numberOfVisitors() {

        System.out.println("<--------------- Counting Guests in Ride History --------------->");
        if (rideLogs.isEmpty()) {
            System.out.println("[INFO] No guests have taken this ride yet.");
            return 0;
        }
        int count = rideLogs.size();
        System.out.println("[STATS] Total guests recorded after the ride: " + count);
        return count;
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor guest) {

        System.out.println("<--------------- Checking Guest in Ride History --------------->");

        if (guest == null) {
            System.out.println("[ERROR] Cannot check a null guest.");
            return false;
        }
        boolean found = rideLogs.contains(guest);
        if (found) {
            System.out.println("[INFO] " + guest.getName() + " is found in the ride record.");
        } else {
            System.out.println("[INFO] " + guest.getName() + " is NOT found in the ride record.");
        }
        return found;
    }


    @Override
    public void addVisitorToHistory(Visitor guest) {
        
        System.out.println("<--------------- Logging Guest in Ride History --------------->");

        if (guest != null) {
            rideLogs.add(guest);
            System.out.println("[SUCCESS] " + guest.getName() + " has been logged in the ride record.");
        } else {
            System.out.println("[ERROR] Cannot log a null guest.");
        }
    }

    public void sortRideHistory() {
        System.out.println("<--------------- Sorting Ride History --------------->");

        if (rideLogs == null || rideLogs.isEmpty()) {
            System.out.println("[ERROR] Ride history is empty. Cannot sort.");
            return;
        }
        if (rideLogs.size() < 2) {
            System.out.println("[INFO] Ride history has only one guest. No sorting needed.");
            return;
        }

        Collections.sort(rideLogs, new RideVisitorComparator());
        System.out.println("Ride history has been sorted by gender and name.");
    }


    
}
