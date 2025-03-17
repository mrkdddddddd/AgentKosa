package hospital;

public class Reservation {
    private Patient patient;

    public Reservation() {
        patient = new Patient();
    }

    public Reservation(Patient patient) {
        super();
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void showReservation() {
        System.out.println("환자 이름: " + patient.getpName());
    }

}
