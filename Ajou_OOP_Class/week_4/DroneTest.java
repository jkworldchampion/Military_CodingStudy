package week_4;
import java.util.*;

public class DroneTest {
    public static void main(String[] args){
        int doing = 0;
        int droneCount = 0;
        Scanner scan = new Scanner(System.in);
        DroneManager dm = new DroneManager();
        while (true) {
            System.out.println();
            System.out.println("1. 드론 추가");
            System.out.println("2. 드론 삭제");
            System.out.println("3. 드론 위치 변경");
            System.out.println("4. 드론 조회");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택: ");
            doing = scan.nextInt();
            scan.nextLine();
            
            switch(doing){
                case 1:   // 드론 추가
                    droneCount += 1;
                    System.out.print("drone code: ");
                    String code = scan.nextLine();
                    System.out.print("position x: ");
                    int x = scan.nextInt();
                    System.out.print("position y: ");
                    int y = scan.nextInt();
                    Drone drone = new Drone(x, y, code);
                    dm.addDrone(drone);
                    break;
                
                case 2:   // 드론 삭제
                    droneCount -= 1;
                    System.out.print("drone code: ");
                    code = scan.nextLine();
                    dm.removeDrone(code);
                    break;
                    
                case 3:
                    System.out.print("drone code: ");
                    code = scan.nextLine();
                    System.out.print("position x: ");
                    x = scan.nextInt();
                    System.out.print("position y: ");
                    y = scan.nextInt();
                    for (int i=0; i<droneCount; i++){
                        if (dm.getDrone(i).getDroneCode().equals(code)){
                            dm.getDrone(i).setPosition(x, y);
                        }
                    }
                    break;
                    
                case 4:
                    for (int i=0; i<droneCount; i++){
                        System.out.printf("drone code: %11s  x: %2d  y: %2d\n", 
                                        dm.getDrone(i).getDroneCode(), 
                                        dm.getDrone(i).getPositionX(), 
                                        dm.getDrone(i).getPositionY());
                    }
                    break;            
            }
            if (doing == 5){
                scan.close();
                break;
            }
        }
        
    }
}
