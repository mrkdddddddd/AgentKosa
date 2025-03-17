
import java.util.ArrayList;
import java.util.Scanner;



public class Hospital {
    private Reservation[] reservations;
    private ArrayList<Treatment> treatments;
    private int count;
    private int total;

    Scanner scanner = new Scanner(System.in);

    public Hospital (){
        reservations = new Reservation[10];
        treatments = new ArrayList<Treatment>();
    }


    public void booking(Reservation reservation) {
        int idx = -1;
        for(int i = 0;i < count; i++){
            if(reservations[i].getPatient().getpName().equals(reservation.getPatient().getpName())){
                System.out.println( "이미 예약된 환자입니다.");
                return;
            }
            
        }
        if(count < reservations.length){
            reservations[count++] = reservation;
            System.out.println(reservations[count - 1].getPatient().getpName());
            System.out.println("예약이 완료되었습니다.");
        }else {
            System.out.println("예약이 마감되었습니다.");
        }
    }   

    public void cancel(String pName) {
        int idx = -1;

		for (int i = 0; i < count; i++) {
			if (reservations[i].getPatient().getpName().equals(pName)) {
				idx = i; // 인덱스 찾기
			}

		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}else {
			for(int i = idx; i < count; i++) {
				if(i == reservations.length -1) { 	//배열의 마지막 요소일 때
					reservations[i] = null;
				}else {
					reservations[i] = reservations[i +1];		//배열의 중간에 빈 공간을 두지 않기 위해서
				}
			}
            System.out.println("예약이 취소되었습니다.");
			count--;
		}
    }   


    public void showList(String pName){
        int idx = -1;
        for (int i = 0; i < count; i++) {
			if (reservations[i].getPatient().getpName().equals(pName)) {
				idx = i; // 인덱스 찾기
			}

		}
        if(idx == -1) {
            System.out.println("예약내역이 없습니다.");
        } else {
            reservations[idx].show();
            System.out.println("예약내역이 확인되었습니다.");
            
        }
        
    }

    public void showAllList(){
        if(count == 0) {
            System.out.println("예약 내역이 없습니다.");
        }
        System.out.println("====전체예약현황====");
        for(int i = 0; i < count; i++) {
            reservations[i].show();
            System.out.println("===============");
        }
    }

    public void writeTreat(String pName, String treat, int cost) {
        Patient patient = new Patient(pName);
        Payment p = new Payment(patient, cost);
        Treatment t = new Treatment(treat, p);
        this.treatments.add(t);
    }

    public void showTreat(String pName){
        for (int i = 0; i < treatments.size(); i++) {
            if(treatments.get(i).getPayment().getPatient().getpName().equals(pName)){
                treatments.get(i).show();
            }
        }
    }
    public void showTreatAll(){
        System.out.println("##전체 진료 내용##");
        for (int i = 0; i < treatments.size(); i++) {
                treatments.get(i).show();
                System.out.println("============");
        }
    }

    
    public void pay(String pName) {
        int idx = -1;
        for (int i = 0; i < treatments.size(); i++) {
            if(treatments.get(i).getPayment().getPatient().getpName().equals(pName)){
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("결제할 내용이 없습니다.");
        } else {
            int pays = treatments.get(idx).getPayment().getCost();
            System.out.println("결제할 금액은 " + pays + "원 입니다.");
            total += pays;
        }
    
    }

    public void showTotal(){
        System.out.println("총 매출액은: " + total + "원 입니다.");
    }

    public boolean haveName(String pName){
        int idx = -1;
		for (int i = 0; i < count; i++) {
			if (reservations[i].getPatient().getpName().equals(pName)) {
				idx = i; // 인덱스 찾기
			}
		}
		if (idx == -1) {
            return false;
        } else {
            return true;
        }
    }

   public void setReservations(Reservation[] reservations) {
       this.reservations = reservations;
   }


   public Reservation[] getReservations() {
       return reservations;
   }

    public void setTreatments(ArrayList<Treatment> treatments) {
        this.treatments = treatments;
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

}
