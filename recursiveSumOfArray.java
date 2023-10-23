package SS;

public class recursiveSumOfArray {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		int start = 0;
		int end = 5;
		System.out.println("The answer is: " + sumOfArray(nums, start, end));
		

	}
	
	public static int sumOfArray(int[] nums, int start, int end) {
		//base case
		if(start == end) {
			return 0;
		}
		
		return nums[start] + sumOfArray(nums, start + 1, end);
		
	}

}
