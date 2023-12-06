// public class arrays {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 91;
//         marks[1] = 34;
//         marks[2] = 65;

//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//         }

//     }

// }

// import java.util.Scanner;

// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();  //takes input of the size
//         int number[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             number[i] = sc.nextInt(); // takes input of the numbers
//         }
//         for (int i = 0; i < size; i++) {
//             System.out.println(number[i]);
//         }
//     }
// }

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (x == number[i]) {
                System.out.println("the number is found at :" + i);
            }

        }
    }
}