package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot Starts Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stops Working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot Can't Eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot Can't Eat");
	}

}
