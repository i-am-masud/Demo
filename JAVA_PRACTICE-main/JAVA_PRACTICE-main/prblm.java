import java.util.Scanner;

public class prblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPasscode  ");
        int passcode = sc.nextInt();
        if (passcode == 1010) {
            System.out.println("\nConfidential message : HELLO\n");
        } else {
            System.out.println("\nERROR :( \nTry again\n");
        }
    }
}
