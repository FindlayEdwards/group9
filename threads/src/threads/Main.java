package threads;

public class Main {

	//main class that gets the list of numbers, create the threads for each method, and then starting them
	public static void main(String[] args) {
		int [] nums = {90,81,78,95,79,72,85};
		//creating the threads
		Thread a = new av(nums);
		Thread a1 = new Min(nums);
		Thread a2 = new max(nums);
		//starting the threads
		a.start();
		a1.start();
		a2.start();
	}

}
