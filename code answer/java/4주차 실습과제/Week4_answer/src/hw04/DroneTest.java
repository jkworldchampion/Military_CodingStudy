package hw04;

import java.util.Scanner;

public class DroneTest {
    static Scanner scan = new Scanner(System.in);
    static DroneManager droneManager = new DroneManager();

    public static void main(String[] args) {

        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println("1. 드론 추가");
            System.out.println("2. 드론 삭제");
            System.out.println("3. 드론 위치 변경");
            System.out.println("4. 드론 조회");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택: ");

            switch (scan.nextInt()) {
                case 1:
                    addDrone();
                    break;

                case 2:
                    removeDrone();
                    break;

                case 3:
                    changePosition();
                    break;

                case 4:
                    searchDrone();
                    break;

                case 5:
                    loopFlag = false;
                    break;

                default:
                    System.out.println("다시 입력해 주세요");
                    break;
            }
            System.out.println();
        }
    }

    public static void addDrone() {
        System.out.print("\ndrone code: ");
        String droneCode = scan.next();

        System.out.print("position x: ");
        int x = scan.nextInt();
        System.out.print("position y: ");
        int y = scan.nextInt();

        droneManager.addDrone(new Drone(x, y, droneCode));
    }

    public static void removeDrone() {
        System.out.print("\ndrone code: ");
        String droneCode = scan.next();

        droneManager.removeDrone(droneCode);
    }

    public static void changePosition() {
        System.out.print("\ndrone code: ");
        String droneCode = scan.next();

        System.out.print("position x: ");
        int x = scan.nextInt();
        System.out.print("position y: ");
        int y = scan.nextInt();

        droneManager.getDrone(droneCode).setPosition(x, y);
    }

    public static void searchDrone() {
        System.out.println();

        for (Drone drone : droneManager.getDroneList()) {
            System.out.println(drone);
        }
    }
}
