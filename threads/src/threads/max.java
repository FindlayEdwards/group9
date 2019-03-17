package threads;

public class max extends Thread{
	//class/thread that gets the mac value from the list of numbers
	int [] nums;
	public max(int [] nums) {
		this.nums = nums;
	}
	//method for finding the max value
	public void run() {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		System.out.println("The maximum value is " + max);
	}
}
