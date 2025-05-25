package week1.day2;

public class FindPalindromeNumber {

	public static void main(String[] args) {
		
		int input = 121; 
        int temp = input; 
        int output = 0; 

        for (int i = input; i > 0; i = i / 10) {
            int rem = i % 10;           
            output = output * 10 + rem; 
        }

        // Compare input and output
        if (temp == output) {
            System.out.println(temp + " is a Palindrome.");
        } else {
            System.out.println(temp + " is NOT a Palindrome.");
        }

	}

}
