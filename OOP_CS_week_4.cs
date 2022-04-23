using System;
using System.Collections;

namespace UAV{
	class Drone{
		private int positionX;
		private int positionY;
		private string dronecode;
		
		public int PositionX{ get; set; }
		public int PositionY{ get; set; }
		public string droneCode{ get; set; }
		
		public Drone(int x, int y, string code){
			PositionX = x;
			PositionY = y;
		}
		
		public void SetPosition(int x, int y){
			PositionX = x;
			PositionY = y;
		}
	}
	
	class DroneManager{
		public ArrayList dronelist = new ArrayList();
		
		public void addDrone(Drone drone){
			dronelist.Add(drone);
		}
		
		public void removeDrone(string droneCode){
			dronelist.Remove(droneCode);
		}
		
		public void removeDrone(int index){
			dronelist.RemoveAt(index);
		}
		
		public object getDrone(string droneCode){
			int myindex = dronelist.IndexOf(droneCode);
			return dronelist[myindex];
		}
		
		public object getDrone(int index){
			object drone = dronelist[index];
			return drone;
		}
	}
	
	class DroneTest{
		public static void Main(){
			DroneManager dm = new DroneManager();
			
			while (true){
				Console.WriteLine("1. 드론 추가");
				Console.WriteLine("2. 드론 삭제");
				Console.WriteLine("3. 드론 위치변경");
				Console.WriteLine("4. 드론 조회");
				Console.WriteLine("5. 프로그램 종료");
				Console.Write("선택 : ");
				int program = int.Parse(Console.ReadLine());
			
				if (program==1){   // 드론 추가
					Console.Write("drone code: ");
					string code = Console.ReadLine();
					Console.Write("position x: ");
					int x = int.Parse(Console.ReadLine());
					Console.Write("position y: ");
					int y = int.Parse(Console.ReadLine());

					Drone drone = new Drone(x, y, code);
					dm.addDrone(drone);
				} else if (program==2){   // 드론 삭제
					Console.Write("drone code: ");
					string code = Console.ReadLine();
					foreach (Drone drone in dm.dronelist){
						Console.WriteLine(drone.droneCode);
					}
				}
			}
			
			
		}
	}
}
