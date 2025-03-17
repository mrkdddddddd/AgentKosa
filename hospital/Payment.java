package hospital;

public class Payment {
    private int cost;
    private Patient patient;
    boolean isPaid = false;

    public Payment() {
        patient = new Patient();
        cost = 0;
    }

    public Payment(Patient patient, int cost) {
        super();
        this.patient = patient;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
