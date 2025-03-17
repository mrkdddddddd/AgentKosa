package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        
        // 사용자 구분 우선

        Scanner scanner = new Scanner(System.in);
        System.out.print("사용자: 1. 환자 2. 의사 3. 직원");

        int userType = scanner.nextInt();
        while (true) {
            
            if (userType == 1) {
                // 환자
                // 예약 (예약확인, 진료내용조회 개별)
                System.out.println("1. 예약 2. 예약확인 3.예약취소 4.진료내용조회 5.결제 6.종료");
                int menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        System.out.print("환자 이름: ");
                        String pName = scanner.nextLine();
                        Reservation reservation = new Reservation(new Patient(pName));
                        hospital.booking(reservation);
                        break;
                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
                        break;

                    case 7:
                        break;

                    case 8:
                        return;                    
                
                    default:
                        System.out.println("잘못된 입력입니다.");
                        break;
                }
                
            } else if (userType == 2) {
                // 의사
                System.out.println("1.예약확인 2.예약취소 3.진료내용및금액입력 4.진료내용조회 5.결제 6.총매출조회 7.종료");
                int menu = scanner.nextInt();
            } else if (userType == 3) {
                // 직원
                System.out.println("1.예약확인 2.예약취소 3.결제 4.종료");
                int menu = scanner.nextInt();
            } else {
                System.out.println("잘못된 입력입니다.");
                
            }
        }

    }
}
