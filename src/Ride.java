public class Ride implements RideInterface {
    private String name;
    private int duration;
    private int thrillLevel;
    private Employee operator;


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
    public void addVisitorToQueue(Visitor visit) {
       
    }

    @Override
    public void removeVisitorFromQueue() {
        
    }
    @Override
    public void printQueue() {
        
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
