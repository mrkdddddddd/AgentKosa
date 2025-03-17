package hospital;

public class Hospital {
    private Reservation[] reservations;
    private int rCount = 0;
    // private int total = 0;

    public Hospital() {
        reservations = new Reservation[10];
    }

    public void booking(Reservation reservation) {
        reservations[rCount++] = reservation;
        System.out.println("예약이 완료되었습니다.");
    }

    public void cancel(String pName) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            for (int j = idx; j < rCount - 1; j++) {
                reservations[j] = reservations[j + 1];
            }
            return;
            
        } else {
            System.out.println("예약된 환자가 없습니다.");
            return;
        }
    }

    public void showAll() {
        System.out.println("===== 전체 예약 현황 ======");
        for (int i = 0; i < rCount; i++) {
            reservations[i].showReservation();
        }
    }

    public void showList(String pName) {
        int idx = -1;
        for (int i = 0; i < rCount; i++) {
            if (reservations[i].getPatient().getpName().equals(pName)) {
                reservations[i].showReservation();
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("예약된 환자가 없습니다.");
            return;
        }
        return;
    }

}
