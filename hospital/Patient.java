package hospital;

public class Patient {
    private String pName;

    public Patient() {}

    public Patient(String pName) {
        super();
        this.pName = pName;
    }
    
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
