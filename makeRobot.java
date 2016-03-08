package JavaRobot;
import java.util.Scanner;

public class makeRobot extends JavaRobotMain{
		Boolean isOn;
		int batteryLife = 100;
		String roboName;
		
		public makeRobot(String name){
			roboName = name;
		}
		
	public void buildRobot(String RobotName){
		roboName = RobotName;
		//System.out.println("Let's name the robot first...");
		//Scanner robotName = new Scanner (System.in);
		//roboName = robotName.next();
		System.out.println("The robots name is " + roboName);
		
		boolean makeTheRobot = true;
		while (makeTheRobot = true){
		System.out.println("Would you like to turn the robot on? 1 is on and 2 is off");
		Scanner turnOn = new Scanner(System.in);
		int TurnOn = turnOn.nextInt();
		
			if (TurnOn == 1){
				System.out.println("You insert the new battery an switch the system on, you hear the hum of the engine starting...");
				//call move function here
				moveRobot move = new moveRobot();
				move.moveBot(100);
				break;
				
			} else if (TurnOn == 2){
				System.out.println("You stand there and stare at the wall waiting for an invitation to turn on the robot.");
				
			} else{
				System.out.println("THATS NOT 1/2!");
			}
		}
	}
}
