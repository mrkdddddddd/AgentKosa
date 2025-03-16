package kosa.hospital;

import java.util.Scanner;

public class Treatment {

    private Scanner sc;
    private Payment payment;
    private Patient patient;
    private String treat;
    
        public Treatment() { }
    
        public Treatment(Patient patient, Payment payment, String treat) {
            super();
            this.patient = patient;
            this.payment = payment;
            this.treat = treat;
        }

    public void writeTreat() {
    System.out.print("1. 환자 2. 의사 3. 직원");
    System.out.print("이용자 : ");
    String menu = DataInsert.sc.nextLine();

    switch(menu) {
        case "1" :
        System.out.print("접근 권한이 없습니다.");
        break;

        case "2" :
        System.out.print("접근 권한이 없습니다.");
        break;

        case "3" :
        System.out.println("환자명 : ");
        String pName = DataInsert.sc.nextLine();
        int idx = -1;

        for(int i=0;i<list.size();i++) {
            if(pName.equals(list.get(i).getName()))
            System.out.print("진료내용: ");
            String treat = DataInsert.sc.nextLine();
            System.out.print("금액: ");
            int cost = DataInsert.sc.nextInt();
            //list.add(new Treatment(treat));
            System.out.println("내용이 저장되었습니다.");

        }

        if(idx == -1){
            System.out.print("예약내역이 존재하지 않습니다.");
        }
        return;
    }

    }

    public void showTreat() {
        System.out.print("1. 환자 2. 의사 3. 직원");
    System.out.print("이용자 : ");
    String menu = DataInsert.sc.nextLine();

    switch(menu) {
        case "1" :
        
        break;

        case "2" :
        System.out.print("접근 권한이 없습니다.");
        break;

        case "3" :
        
        return;
    }

    }

}
