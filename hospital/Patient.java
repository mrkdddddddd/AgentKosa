package kosa.hospital;

public class Patient {

    private String pName;

    public Patient() {}

    public Patient(String PName) {
        super();
        this.pName = pName;
    }

    public void show() {
        System.out.println("이름: "+pName);
    }

    public String getName() {
        return this.pName;
    }

    public void setName(String pName) {
        this.pName = pName;
    }
    

}
