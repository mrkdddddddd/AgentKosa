


public class Reservation {
  private Patient patient;
    
public Reservation(){}

public Reservation(Patient patient){
    this.patient = patient;
}


public void show() {
    // patient = pName;
   System.out.println(this.patient.getpName() + "님");
}

public void setPatient(Patient patient) {
    this.patient = patient;
}

public Patient getPatient() {
    return patient;
}

}
