package JavaRobot;
import java.util.*;

public class robotContainer/* extends makeRobot*/{
	
	ArrayList<makeRobot> roboList = new ArrayList<makeRobot>();
	

	public void RobotList(){
		
	}
	public void makeNewRobot(){
		System.out.println("What is this robots' name?");
		Scanner name = new Scanner(System.in);
		String theRobotName = name.next();
			makeRobot makerobot = new makeRobot(theRobotName);
			roboList.add(makerobot);
			
			System.out.println(roboList.get(0).roboName);
	}
}
