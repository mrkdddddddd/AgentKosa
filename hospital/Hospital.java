package kosa.hospital;

import java.util.List;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        Reservation r = new Reservation();
        Treatment t = new Treatment();

        while(true) {
            System.out.print("1. ���� 2. ������� 3. ���ο�����ȸ 4. ��ü���� ��ȸ 5. ���᳻�� �� �ݾ� �Է� 6. ���᳻�� ��ȸ 7. ����ݾ� ��ȸ 8. �Ѹ��� Ȯ�� 9. ����");
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
                System.out.println("����");
                return;
            }

        }

}
