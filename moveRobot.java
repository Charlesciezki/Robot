package JavaRobot;
import java.util.Scanner;

public class moveRobot{
	String mRight;
	String mLeft;
	String mBack;
	String mForward;
	
	public void moveBot(int batteryLife/*, String mRight, String mLeft, String mBack, String mForward*/){
		
		Boolean willMove = true;
		while (willMove == true){
			
		System.out.println("Welcome to the robot directional system!");
		System.out.println("Enter 1 to move forward");
		System.out.println("Enter 2 to move back");
		System.out.println("Enter 3 to move left");
		System.out.println("Enter 4 to move right");
		System.out.println("Enter 5 to quit navigation system");
		System.out.println("Enter 6 to create an army of killer robots!");
		Scanner move = new Scanner(System.in);
		int newMove = move.nextInt();
		
		if (batteryLife == 0){
			System.out.println("OUT OF BATTERYLIFE RECHAARGE BATTERY!!");
			System.out.println("Your battery life is " + batteryLife);
			batteryLife = 100;
			rechargeBattery chargeBattery = new rechargeBattery();
			chargeBattery.chargeUpBattery(batteryLife);
			
		} else if (newMove == 2){
			System.out.println("The robot moved backward");
			batteryLife -= 10;
			System.out.println("Your battery life is " + batteryLife);
			
		} else if (newMove == 3){
			System.out.println("The robot moved left");
			batteryLife -= 10;
			System.out.println("Your battery life is " + batteryLife);
			
		} else if (newMove == 4){
			System.out.println("The robot moved right");
			batteryLife -= 10;
			System.out.println("Your battery life is " + batteryLife);
			
		} else if (newMove == 1){
			System.out.println("The robot moved forward");
			batteryLife -= 10;
			System.out.println("Your battery life is " + batteryLife);
			
		} else if (newMove == 5){
			System.out.println("You have quit the navigation system");
			System.exit(0);
			
		} else if (newMove == 6){
			System.out.println("Starting robot creation unit...activated!");
			robotContainer newBot = new robotContainer();
			newBot.makeNewRobot();
			
			
		} else {
			System.out.println("That's no small moon...I mean you entered in the wrong command");
		}
		}
		
	}
}
