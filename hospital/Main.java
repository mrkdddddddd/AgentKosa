package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // 초기 데이터
        hospital.booking(new Reservation(new Patient("홍길동")));
        hospital.booking(new Reservation(new Patient("김철수")));
        hospital.booking(new Reservation(new Patient("이영희")));
        hospital.booking(new Reservation(new Patient("박민수")));
        hospital.booking(new Reservation(new Patient("최영수")));
        hospital.booking(new Reservation(new Patient("김민수")));
        hospital.booking(new Reservation(new Patient("3")));
        hospital.booking(new Reservation(new Patient("2")));
        hospital.booking(new Reservation(new Patient("1")));

        
        while (true) {            
            Scanner scanner = new Scanner(System.in);
            System.out.println("사용자: 1. 환자 2. 의사 3. 직원");

            int userType = Integer.parseInt(scanner.nextLine());
            while (true) {
                
                if (userType == 1) {
                    // 환자
                    // 예약 (예약확인, 진료내용조회 개별)
                    System.out.println("1. 예약 2. 예약확인 3.예약취소 4.진료내용조회 5.결제 6.종료");
                    int menu = Integer.parseInt(scanner.nextLine());
                    String pName = "";
                    

                    switch (menu) {
                        case 1:
                            // 예약
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            Reservation reservation = new Reservation(new Patient(pName));
                            hospital.booking(reservation);
                            continue;

                        case 2:
                            // 예약확인
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.showList(pName);

                            continue;

                        case 3:
                            // 예약취소
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.cancel(pName);

                            continue;

                        case 4:
                            // 진료내용조회
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.showTreat(pName);;

                            continue;

                        case 5:
                            // 결제
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.pay(pName);

                            continue;

                        case 6:
                            // 종료
                            break;               
                    
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    break;
                    
                } else if (userType == 2) {
                    // 의사
                    System.out.println("1.예약확인 2.예약취소 3.진료내용및금액입력 4.진료내용조회 5.결제 6.총매출조회 7.종료");
                    int menu = Integer.parseInt(scanner.nextLine());
                    String pName = "";
                    switch (menu) {
                        case 1:
                            // 예약확인
                            System.out.println("1. 전체 2. 개별");
                            int select = Integer.parseInt(scanner.nextLine());
                            if (select == 1) {
                                hospital.showAllList();
                            } else if (select == 2) {
                                System.out.print("환자 이름: ");
                                pName = scanner.nextLine();
                                hospital.showList(pName);
                            } else {
                                System.out.println("잘못된 입력입니다.");
                            }

                            continue;

                        case 2:
                            // 예약취소
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.cancel(pName);

                            continue;

                        case 3:
                            // 진료내용및금액입력
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            if (!hospital.haveName(pName)) {
                                System.out.println("예약된 환자가 없습니다.");
                                continue;
                            }
                            System.out.print("진료내용: ");
                            String treat = scanner.nextLine();
                            System.out.print("비용: ");
                            int cost = Integer.parseInt(scanner.nextLine());

                            hospital.writeTreat(pName, treat, cost);

                            continue;

                        case 4:
                            // 진료내용조회
                            System.out.println("1. 전체 2. 개별");
                            int select1 = Integer.parseInt(scanner.nextLine());
                            if (select1 == 1) {
                                hospital.showTreatAll();
                            } else if (select1 == 2) {
                                System.out.print("환자 이름: ");
                                pName = scanner.nextLine();
                                hospital.showTreat(pName);
                            } else {
                                System.out.println("잘못된 입력입니다.");
                            }

                            continue;

                        case 5:
                            // 결제
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.pay(pName);

                            continue;

                        case 6:
                            // 총매출조회
                            hospital.showTotal();

                            continue;
                        case 7:
                            // 종료
                            break;                    
                    
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    break;
                } else if (userType == 3) {
                    // 직원
                    System.out.println("1.예약확인 2.예약취소 3.결제 4.종료");
                    int menu = Integer.parseInt(scanner.nextLine());
                    String pName = "";

                    switch (menu) {
                        case 1:
                            // 예약확인
                            System.out.println("1. 전체 2. 개별");
                            int select = Integer.parseInt(scanner.nextLine());

                            if (select == 1) {
                                hospital.showAllList();
                            } else if (select == 2) {
                                System.out.print("환자 이름: ");
                                pName = scanner.nextLine();
                                hospital.showList(pName);
                            } else {
                                System.out.println("잘못된 입력입니다.");
                            }
                            
                            continue;

                        case 2:
                            // 예약취소
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.cancel(pName);

                            continue;

                        case 3:
                            // 결제
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.pay(pName);

                            continue;
                        
                        case 4:
                            // 종료
                            break;
                    
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                    break;
                }
            }
        }
    }
}