
import java.util.Scanner;

public class Treatment {
    private String treat;
    private Payment payment;

    Scanner sc = new Scanner(System.in);

    public Treatment(){}

    public Treatment(String treat, Payment payment){
        this.payment = payment;
        this.treat = treat;
    }
    public Treatment(Payment payment){
        this.payment = payment;
        // this.treat = treat;
    }

    // public Treatment(Patient patient.get, String tret){
    //     patient.
    //     this.treat = treat;
    // }

    // public void writeTreat(Patient pName,int cost,String treat) {
    //     System.out.println("환자 이름: " + pName);
    //     System.out.print("진료 내용: ");
    //     treat = sc.nextLine();
    // }

    // public void writePayment(String pName, Payment cost) {
    //     System.out.println("환자 이름: " + pName);
    //     System.out.print("진료 금액: " + cost);
    // }

    public void show() {
        System.out.println("환자 이름: " + this.payment.getPatient().getpName());
        System.out.println("진료 내용: " + treat);
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getTreat() {
        return treat;
    }



}
