public class Employee extends Person {
    private String id;
    private String department;

    public Employee() {

    }

    public Employee(String name, String gender, String phone, String id, String department) {
        super(name, gender, phone);
        this.id = id;
        this.department = department;
    }

    public String getId() {
         return id; 
    }

    public void setId(String id) { 
        this.id = id; 
    }

    public String getDepartment() { 
        return department; 
    }
    
    public void setDepartment(String department) { 
        this.department = department; 
    }

}
