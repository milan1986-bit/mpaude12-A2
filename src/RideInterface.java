public interface RideInterface {
    void addVisitorToQueue(Visitor visit);
    void removeVisitorFromQueue();
    void printQueue();

    void runOneCycle();

    void addVisitorToHistory(Visitor visit);
    boolean checkVisitorFromHistory(Visitor visit);
    int numberOfVisitors();
    void printRideHistory();
}
