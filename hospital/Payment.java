package kosa.hospital;


public class Payment {

    private Patient patient;
    private int cost;


    public Payment() { }


    public Payment(String PName, int cost) {
        super();
        this.pName = pName;
        this.cost = cost;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

        


}
