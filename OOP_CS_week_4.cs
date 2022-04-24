using System;
using System.Collections;

namespace UAV{
	class Drone{
		private int positionx;   // 의철이 말대로 private 설정한 뒤 get과 set메소드 사용
		private int positiony;
		private string dronecode;
		
		public int PositionX{ 
			get{ return positionx; }
			set{ positionx = value; } 
		}  
		public int PositionY{ 
			get{ return positiony; }
			set{ positiony = value; } 
		}
		public string droneCode{ 
			get{ return dronecode; }
			set{ dronecode = value; }
		}
		
		public Drone(int x, int y, string code){  // 생성자
			PositionX = x;
			PositionY = y;
			droneCode = code;
		}
		
		public void SetPosition(int x, int y){   // 위치변경 메소드
			PositionX = x;
			PositionY = y;
		}
	}
	
	class DroneManager{
		public ArrayList dronelist = new ArrayList();   // 사용하기 쉽게 arraylist선언
		
		public void addDrone(Drone drone){    // 드론을 추가하는 메소드
			dronelist.Add(drone);
		}
		
		public void removeDrone(string code){  // 이넘은 귀찮지만 돌면서 인덱스를 찾아 없애야함
			int index = 0;
			foreach(Drone drone in dronelist){
				if (drone.droneCode == code){
					break;
				} else { index += 1; }
			}
			dronelist.RemoveAt(index);
		}
		
		public void removeDrone(int index){   // 이건 바로 사용할 수 있는 메소드가 있쥐
			dronelist.RemoveAt(index);
		}
		
		public object getDrone(string code){   // 얘도 아까와 비슷하게 만듦
			int index = 0;
			foreach(Drone drone in dronelist){
				if (drone.droneCode == code){
					break;
				} else { index += 1; }
			}
			return dronelist[index];
		}
		
		public object getDrone(int index){    // 이게 맞을까...?
			object drone = dronelist[index];
			return drone;
		}
	}
	
	class DroneTest{
		public static void Main(){
			DroneManager dm = new DroneManager();   // 우리 매니저씨 만들어주고
			
			while (true){   // 5번이 선택되기 전까지 계속됨. 
				Console.WriteLine("1. 드론 추가");
				Console.WriteLine("2. 드론 삭제");
				Console.WriteLine("3. 드론 위치 변경");
				Console.WriteLine("4. 드론 조회");
				Console.WriteLine("5. 프로그램 종료");
				Console.Write("선택 : ");
				int program = int.Parse(Console.ReadLine());
			
				if (program == 1){   // 드론 추가  - 구현 완료
					Console.Write("drone code: ");
					string code = Console.ReadLine();
					Console.Write("position x: ");
					int x = int.Parse(Console.ReadLine());
					Console.Write("position y: ");
					int y = int.Parse(Console.ReadLine());
					
					Drone drone = new Drone(x, y, code);
					dm.addDrone(drone);
				} 
				
				else if (program == 2){   // 드론 삭제 - 완료
					Console.Write("drone code: ");
					string code = Console.ReadLine();
					
					dm.removeDrone(code);
				} 
				
				else if (program == 3){   // 드론 위치 변경 - 완료
					Console.Write("drone code: ");
					string code = Console.ReadLine();
					Console.Write("position x: ");
					int x = int.Parse(Console.ReadLine());
					Console.Write("position y: ");
					int y = int.Parse(Console.ReadLine());
					
					foreach(Drone drone in dm.dronelist){
						if (drone.droneCode == code){
							drone.SetPosition(x, y);
							break;
						}
					}
				} 
				
				else if (program == 4){   // 드론 조회 - 구현 완료
					foreach(Drone drone in dm.dronelist){
						Console.WriteLine($"drone code: {drone.droneCode, 13} x: {drone.PositionX, 3} y: {drone.PositionY, 3}");
					}
				} 
				
				else if (program == 5){   // 프로그램 종료 - 완료
					break;
				}
			}
			
			
		}
	}
}
