package day.one;

public class PracticeClass {
	
	
	public static void main(String[] args) {
		
		System.out.println("first practice");
		
		
		
		int [] arr = {3,2,5,6,15};
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
		
	}

}
