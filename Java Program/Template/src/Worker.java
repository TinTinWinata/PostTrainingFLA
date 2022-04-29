public abstract class Worker {

	String name;

	public Worker(String name) {
		super();
		this.name = name;
	}

	public void wakeUp() {
		System.out.println(name + " has woke up");
	}

	public abstract void work();

	public abstract void showEarning();

	public void goSleep() {
		System.out.println(name + " is sleeping");
	}

	public void routine() {
		wakeUp();
		work();
		showEarning();
		goSleep();
	}
}