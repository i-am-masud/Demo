// *******************************************PRINT RECTANGLE OF * **************************************************

// public class nested_loop {
//     public static void main(String[] args) {
//         for (int i = 1; i < 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             // System.out.println("*");
//         }
//     }

// }

// ************************************** PRINT RECTANGLE OF * WITH USER INPUT *************************************

// import java.util.Scanner;

// public class nested_loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of rows");
//         int n = sc.nextInt();
//         System.out.println("Enter no of columns");
//         int m = sc.nextInt();
//         System.out.println("Your pattern : \n");
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//************************************ PRINT HOLLOW RECTANGLE WITH USER INPUT **************************************

// import java.util.*;

// public class nested_loop {
//     public static void main(String[] args) {
//         // int n = 4;
//         // int m = 6;
//         Scanner md = new Scanner(System.in);
//         System.out.println("Enter row no : ");
//         int n = md.nextInt();
//         System.out.println("Enter column no : ");
//         int m = md.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// } 

// ******************************** PRINT HALF-PYRAMID WITH *'s WITH USER INPUT *************************************

// import java.util.*;

// public class nested_loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" Enter base of pyramid : ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//     }

// }