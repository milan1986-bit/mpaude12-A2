import java.util.Comparator;

public class RideVisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First compare by gender (alphabetically)
        int genderCompare = v1.getGender().compareToIgnoreCase(v2.getGender());

        // If gender is the same, compare by name
        if (genderCompare == 0) {
            return v1.getName().compareToIgnoreCase(v2.getName());
        }

        return genderCompare;
    }
}
