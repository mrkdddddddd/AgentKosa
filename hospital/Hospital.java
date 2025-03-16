package kosa.hospital;

import java.util.List;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Reservation r = new Reservation();
        Treatment t = new Treatment();

        while(true) {
            System.out.print("1. 예약 2. 예약취소 3. 개인예약조회 4. 전체예약 조회 5. 진료내용 및 금액 입력 6. 진료내용 조회 7. 진료금액 조회 8. 총매출 확인 9. 종료");
            String menu = DataInsert.sc.nextLine();

            switch(menu) {
                case "1" :
                r.booking();
                break;

                case "2" :
                r.cancel();
                break;

                case "3" :
                r.showList();
                break;

                case "4" :
                r.showAllList();
                break;

                case "5" :
                t.writeTreat();
                break;

                case "6" :
                t.showTreat();
                break;

                case "7" :
                r.showAllList();
                break;

                case "8" :
                public void showTotal(){

                };
                break;

                case "9" :
                System.out.println("종료");
                return;
            }

        }

}
