import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String name;
    private int duration;
    private int thrillLevel;
    private Employee operator;

    private Queue<Visitor> waitingLine = new LinkedList<>();

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
    public void addVisitorToHistory(Visitor visit) {

    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visit) {
        return false;
    }

    @Override
    public int numberOfVisitors() {
        return 0;
    }

    @Override
    public void printRideHistory() {
    }




}
