package demo.flyweight;

import java.util.HashMap;

import demo.flyweight.robot.IRobot;
import demo.flyweight.robot.impl.BigRobot;
import demo.flyweight.robot.impl.SmallRobot;

public class RobotFactory {

	public RobotFactory() {
		// TODO Auto-generated constructor stub
	}

	HashMap<String, IRobot> shapes = new HashMap<>();

	public int totalRobotCreated() {
		return shapes.size();
	}

	public IRobot getRobot(String RobotCategory) throws Exception {
		IRobot robotCategory = null;
		if (shapes.containsKey(RobotCategory)) {
			robotCategory = shapes.get(RobotCategory);
		} else {
			switch (RobotCategory) {
			case "small":
				System.out.println("We do not have Small Robot. So we are creating a Small Robot now.");
				robotCategory = new SmallRobot();
				shapes.put("small", robotCategory);
				break;
			case "large":
				System.out.println("We do not have Large Robot. So we are creating a Large Robot now.");
				robotCategory = new BigRobot();
				shapes.put("large", robotCategory);
				break;
			default:
				throw new Exception( " Robot Factory can create only small and large shapes");
			}
		}
		return robotCategory;
	}
}
