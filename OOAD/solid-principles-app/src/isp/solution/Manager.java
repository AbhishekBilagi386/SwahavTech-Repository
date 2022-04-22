package isp.solution;

public class Manager implements IWorkEat {

	@Override
	public void startEat() {
		System.out.println("Manager Starts Working");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stops Working");
	}

	@Override
	public void startWork() {
		System.out.println("Manager Starts Eating");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stops Eating");
	}

}
