package hospital;

import java.util.ArrayList;

public class Hospital {
    private Reservation[] reservations;
    private int rCount;
    private ArrayList<Treatment> treatments;
    private int total;

    public Hospital() {
        reservations = new Reservation[10];
        rCount = 0;
        treatments = new ArrayList<Treatment>();
        total = 0;
    }

    // Reservation 메소드
    public void booking(Reservation reservation) {
        for (int i = 0; i < rCount; i++) {
            if (reservation.getPatient().getpName().equals(reservations[i].getPatient().getpName())) {
                System.out.println("이미 예약이 존재합니다.");
                return;
            }
        }
        
        if (rCount >= 10) {
            System.out.println("예약이 꽉 찼습니다.");
            return;
        }
        reservations[rCount++] = reservation;
        System.out.println("예약이 완료되었습니다.");
        return;
    }

    public void cancel(String pName) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                reservations[i] = null;
                idx = i;
            }
        }

        if (idx != -1) {
            for (int j = idx; j < rCount - 1; j++) {
                reservations[j] = reservations[j + 1];
            }
            rCount--;
            System.out.println("예약이 취소되었습니다.");
            
        } else {
            System.out.println("예약된 환자가 없습니다.");
        }
        return;
    }

    public void showAllList() {
        System.out.println("===== 전체 예약 현황 ======");
        for (int i = 0; i < rCount; i++) {
            reservations[i].showReservation();
        }
        return;
    }

    public void showList(String pName) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                // reservations[i].showReservation();
                System.out.println("이미 예약되었습니다.");
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("예약된 환자가 없습니다.");
            return;
        }
        return;
    }

    // Treatment 메소드
    public boolean haveName(String pName) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                idx = i;
            }
        }

        if (idx != -1) return true;
         else return false;
    }

    public void cancelForWrite(String pName) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                reservations[i] = null;
                idx = i;
            }
        }

        if (idx != -1) {
            for (int j = idx; j < rCount - 1; j++) {
                reservations[j] = reservations[j + 1];
            }
            rCount--;            
        } else {
            System.out.println("예약된 환자가 없습니다.");
        }
        return;
    }

    public void writeTreat(String pName, String treat, int cost) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                idx = i;
            }
        }

        if (idx != -1) {
            treatments.add(new Treatment(treat, new Payment(new Patient(pName), cost)));
            this.cancelForWrite(pName);
            System.out.println("진료가 완료되었습니다.");
        } else {
            System.out.println("예약된 환자가 없습니다.");
        }
        return;
    }
    
    public void showTreatAll() {
        System.out.println("===== 전체 진료 내용 =====");
        for (Treatment t : treatments) {
            t.show();
        }
        return;
    }

    public void showTreat(String pName) {
        int idx = -1;
        for (Treatment t : treatments) {
            if (t.getPayment().getPatient().getpName().equals(pName)) {
                t.show();
                idx = 1;
            }
        }
        if (idx == -1) {
            System.out.println("진료 내역이 없습니다.");
        }
        return;
    }

    public void pay(String pName) {
        int idx = -1;
        for (int i = 0; i < treatments.size(); i++) {
            if (treatments.get(i).getPayment().getPatient().getpName().equals(pName) 
                && !treatments.get(i).getPayment().isPaid()) {
                idx = i; 
                total += treatments.get(i).getPayment().getCost();
                treatments.get(i).getPayment().setPaid(true);
                System.out.println("비용: " + treatments.get(i).getPayment().getCost());
                System.out.println("결제가 완료되었습니다.");
            }
        }
        if (idx == -1) {
            System.out.println("진료 내역이 없습니다.");
            return;
        }
        return;
    }

    public void showTotal() {
        System.out.println("총 매출: " + total);
        return;
    }
}
