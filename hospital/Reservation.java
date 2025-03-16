package kosa.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservation {

    List<Patient>list;
    private Scanner sc;

    public Reservation() {
        list = new ArrayList<Patient>(10);
        sc = new Scanner(System.in);
    }


    public void booking() {
        System.out.print("1. 환자 2. 의사 3. 직원");
        System.out.print("이용자 : ");
        String menu = DataInsert.sc.nextLine();

        //환자의 예약정보가 예약시스템에 존재하면 안된다.
        //예약시스템에 등록되어 있는 예약정보가 10개 미만이어야 한다
        switch(menu) {
            case "1" :
            System.out.println("환자명 : ");
            String pName = DataInsert.sc.nextLine();
            int idx=-1;

            for(int i=0;i<list.size();i++) {
                if(pName.equals(list.get(i).getName()))
                System.out.print("기존 예약이 있어 예약이 불가합니다.");
                
            }
            if(idx==-1){
                list.add(new Patient(pName));
                System.out.print("예약이 완료되었습니다.");
            }
            break;

            case "2" :
            System.out.print("접근 권한이 없습니다.");
            break;

            case "3" :
            System.out.print("접근 권한이 없습니다.");
            return;
        }
    }


    public void cancel() {

        System.out.print("1. 환자 2. 의사 3. 직원");
        System.out.print("이용자 : ");
        String menu = DataInsert.sc.nextLine();

        switch(menu) {
            case "1" :
            System.out.println("환자명 : ");
            String pName = DataInsert.sc.nextLine();
            int idx = -1;

            for(int i=0;i<list.size();i++) {
                Patient info = list.get(i);
                if(pName.equals(list.get(i).getName())) {
                    list.remove(info);
                    idx = i;
                }
                 
            }
            if(idx == -1){
                System.out.print("예약내역이 존재하지 않습니다.");
            }
            break;

            case "2" :
            System.out.print("접근 권한이 없습니다.");
            break;

            case "3" :
            System.out.print("접근 권한이 없습니다.");
            return;
        }

    }

    public void showList() {

        System.out.print("환자명 : ");
        String pName = DataInsert.sc.nextLine();
        int idx = -1;

        for(int i=0;i<list.size();i++) {
            Patient info = list.get(i);
            if(pName.equals(info.getName())) {
                list.get(i).show();
                idx = i;
            }
            
        }
        if(idx==-1) {
            System.out.println("예약내역이 존재하지 않습니다.");
        }



    }

    public void showAllList() {

        System.out.print("1. 환자 2. 의사 3. 직원");
        System.out.print("이용자 : ");
        String menu = DataInsert.sc.nextLine();

        switch(menu) {
            case "1" :
            System.out.print("접근 권한이 없습니다.");
            break;
 
            case "2" :
            System.out.print("--전체 예약 목록--");
            int idx = -1;
            for(int i=0;i<list.size();i++) {
                Patient info = list.get(i);
                info.show();
                idx = i;
                }

            if(idx == -1){
                System.out.print("예약내역이 존재하지 않습니다.");
            }
            break;

            case "3" :
            System.out.print("--전체 예약 목록--");
            int idx = -1;
            for(int i=0;i<list.size();i++) {
                Patient info = list.get(i);
                info.show();
                idx = i;
                }

            if(idx == -1){
                System.out.print("예약내역이 존재하지 않습니다.");
            }
            return;
        }

    }


}
