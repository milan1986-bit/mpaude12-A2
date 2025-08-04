public class Visitor extends Person {
   
    private String tokenNumber;
    private String visitDetail;

    public Visitor() {}

    public Visitor(String name, String gender, String phone, String tokenNumber, String visitDetail) {
        super(name, gender, phone);
        this.tokenNumber = tokenNumber;
        this.visitDetail = visitDetail;
    }

    public String getTokenNumber() {
         return tokenNumber; 
    }
    public void setTokenNumber(String tokenNumber) { 
        this.tokenNumber = tokenNumber; 
    }

    public String getVisitDetail() { 
        return visitDetail; 
    }
    public void setVisitDetail(String visitDetail) { 
        this.visitDetail = visitDetail; 
    }

}
