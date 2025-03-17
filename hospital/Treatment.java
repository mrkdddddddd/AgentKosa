package hospital;

public class Treatment {
    private String treat;
    private Payment payment;

    public Treatment() {
        payment = new Payment();
    }

    public Treatment(String treat, Payment payment) {
        super();
        this.treat = treat;
        this.payment = payment;
    }
    
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void show() {
        System.out.println("환자 이름: " + payment.getPatient().getpName());
        System.out.println("진료: " + this.treat);
    }

}
