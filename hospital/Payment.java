
public class Payment {
    private int cost;
    private Patient patient;
    
    public Payment (){}
    public Payment (Patient patient, int cost){
        super();
        this.cost = cost;
        this.patient = patient;
    }

    public int getCost() {
        return cost;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
