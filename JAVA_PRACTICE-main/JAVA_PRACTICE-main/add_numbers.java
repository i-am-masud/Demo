import java.util.Scanner;

import java.util.Scanner;

public class add_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("the sum of 2 number is ");
        System.out.println(sum);
    }
}
