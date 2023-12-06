import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a scanner to obtain input from the user
        System.out.print("Input a string: "); // Prompt the user to input a string
        char[] letters = sc.nextLine().toCharArray(); // Read the input string and convert it to a character array
        System.out.print("Reverse string: "); // Display a message before printing the reversed string
        for (int i = letters.length - 1; i >= 0; i--) { // Iterate through the character array in reverse order
            System.out.print(letters[i]); // and print each character
        }
        System.out.print("\n"); // Print a newline character to end the output line
    }
}
