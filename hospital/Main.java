
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Reservation reser = new Reservation(new Patient("이민영"));
        Reservation reser1 = new Reservation(new Patient("강신혁"));
        Reservation reser2 = new Reservation(new Patient("노지혜"));
        hospital.booking(reser);
        hospital.booking(reser1);
        hospital.booking(reser2);
        // 사용자 구분 우선

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("사용자: 1. 환자 2. 의사 3. 직원");
            System.out.print("입력: ");
            int userType = Integer.parseInt(scanner.nextLine());
            
            
            while (true) {
                
                if (userType == 1) {
                    // 환자
                    // 예약 (예약확인, 진료내용조회 개별)
                    System.out.println("1. 예약 2. 예약확인 3.예약취소 4.진료내용조회 5.결제 6.종료");
                    System.out.print("입력: ");
                    int menu = Integer.parseInt(scanner.nextLine());
                    String pName;
                    if(menu == 6) {
                        break;
                    }else {
                        System.out.print("환자 이름: ");
                        pName = scanner.nextLine();
                    }
                    switch (menu) {
                        case 1: //예약
                            Reservation reservation = new Reservation(new Patient(pName));
                            System.out.println(pName);
                            hospital.booking(reservation);
                            continue;
                        case 2: //예약확인
                            // Reservation reservation = new Reservation(new Patient(pName));
                            hospital.showList(pName);
                            continue;

                        case 3://예약취소
                            hospital.cancel(pName);
                            continue;

                        case 4:
                            hospital.showTreat(pName);
                            continue;
                        case 5:
                            hospital.pay(pName);
                            continue;

                        case 6: //종료
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
                    String pName;
                    switch (menu) {
                        case 1: //예약확인1
                            System.out.println("1.예약내역 조회 2.전체 예약내역");
                            System.out.print("입력: " );
                            int submenu1 = Integer.parseInt(scanner.nextLine());
                            if(submenu1 == 1) {
                                System.out.print("환자 이름: ");
                                String name = scanner.nextLine();
                                hospital.showList(name);
                            }else {
                                hospital.showAllList();
                            }
                            continue;

                        case 2://예약취소
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.cancel(pName);
                            continue;

                        case 3://진료내용및금액입력
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            if(hospital.haveName(pName)){
                                System.out.println("진료 내용: ");
                                String treat = scanner.nextLine();
                                System.out.print("진료 금액: ");
                                int cost = Integer.parseInt(scanner.nextLine());
                                hospital.writeTreat(pName, treat, cost);

                            }else {
                                System.out.println("해당 환자가 존재하지 않습니다.");
                            }
                            continue;

                        case 4: //진료내용조회
                        System.out.println("1.진료내용 조회 2.전체 진료내용");
                            System.out.print("입력: " );
                            int submenu2 = Integer.parseInt(scanner.nextLine());
                            if(submenu2 == 1) {
                                System.out.print("환자 이름: ");
                                String name = scanner.nextLine();
                                hospital.showTreat(name);
                            }else {
                                hospital.showTreatAll();
                            }
                            continue;

                        case 5: //결제
                            System.out.println("환자 이름: ");
                            String name = scanner.nextLine();
                            hospital.pay(name);
                            continue;

                        case 6: //총매출조회 
                            hospital.showTotal();
                            continue;

                        case 7: //종료
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
                    String pName;
                    switch (menu) {
                        case 1: //예약확인1
                            System.out.println("1.예약내역 조회 2.전체 예약내역");
                            System.out.print("입력: " );
                            int submenu1 = Integer.parseInt(scanner.nextLine());
                            if(submenu1 == 1) {
                                System.out.print("환자 이름: ");
                                String name = scanner.nextLine();
                                hospital.showList(name);
                            }else {
                                hospital.showAllList();
                            }
                            continue;

                        case 2://예약취소
                            System.out.print("환자 이름: ");
                            pName = scanner.nextLine();
                            hospital.cancel(pName);
                            continue;

                        case 3: //결제
                            System.out.println("환자 이름: ");
                            String name = scanner.nextLine();
                            hospital.pay(name);
                            continue;

                        case 4: //종료
                            break;                    
                    
                        default:
                            System.out.println("잘못된 입력입니다.");
                            continue;
                    }
                    break;

                } else {
                    System.out.println("잘못된 입력입니다.");
                    
                }
            }

        }
    }

}