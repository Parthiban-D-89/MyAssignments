package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8, first = 0, second = 1;

		for (int i = 1; i <= range; i++) {
			
			System.out.println(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
