package demo.flyweight;

import demo.flyweight.robot.IRobot;

public class FlyweightMainCls {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RobotFactory myfactory = new RobotFactory();
		IRobot shape = myfactory.getRobot("small");
		shape.print();
		
		for (int i = 0; i < 2; i++)
		{
			shape = myfactory.getRobot("small");
			shape.print();
		}
		System.out.println("Created object:" +myfactory.totalRobotCreated());
		
		for (int i = 0; i < 6; i++)
		{
			shape = myfactory.getRobot("large");
			shape.print();
		}
		System.out.println("Created object:" +myfactory.totalRobotCreated());
	}

}
