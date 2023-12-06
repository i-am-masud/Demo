

// import java.util.*;

// public class problem_practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println("Hello ! ");
// System.out.println(name);
// }
// }

// import java.util.*;

// public class problem_practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("First number : ");
// int firstNumber = sc.nextInt();
// System.out.println("Second number : ");
// int secondNumber = sc.nextInt();
// int sum = firstNumber + secondNumber;
// System.out.println("Sum of numbers = " + sum);
// }
// }

// import java.util.*;

// public class problem_practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number : ");
// int number = sc.nextInt();
// for (int i = 1; i < 11; i++) {
// System.out.println(number + "x" + i + "=" + number * i);
// }
// }

// }

// public class problem_practise {
// public static void main(String[] args) {
// // Display Java version
// System.out.println("\nJava Version: " + System.getProperty("java.version"));

// // Display Java runtime version
// System.out.println("Java Runtime Version: " +
// System.getProperty("java.runtime.version"));

// // Display Java home directory
// System.out.println("Java Home: " + System.getProperty("java.home"));

// // Display Java vendor name
// System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

// // Display Java vendor URL
// System.out.println("Java Vendor URL: " +
// System.getProperty("java.vendor.url"));

// // Display Java class path
// System.out.println("Java Class Path: " +
// System.getProperty("java.class.path") + "\n");
// }
// }

// import java.util.*;
// public class problem_practise {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("First number : ");
// int firstnumber = sc.nextInt();
// System.out.println("Second number : ");
// int secondnumber = sc.nextInt();

// if (firstnumber == secondnumber) {
// System.out.printf("%d = %d \n", firstnumber, secondnumber);
// }
// if (firstnumber != secondnumber) {
// System.out.printf("%d != %d \n", firstnumber, secondnumber);
// }
// if (firstnumber > secondnumber) {
// System.out.printf("%d > %d \n", firstnumber, secondnumber);
// }
// if (firstnumber < secondnumber) {
// System.out.printf("%d < %d \n", firstnumber, secondnumber);
// }

// }
// }

// import java.util.Scanner;

// public class problem_practise {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Input an integer: ");
// long n = input.nextLong();
// System.out.println("The sum of the digits is: " + sumDigits(n));
// }
// public static int sumDigits(long n) {
// int sum = 0;
// while (n != 0) {
// sum += n % 10;
// n /= 10;
// }

// return sum;
// }
// }

// ************************************************ REVERSE  of a STRING *************************************************
// import java.util.Scanner;

// public class problem_practise {
//     public static void main(String[] args) {
//         // Create a scanner to obtain input from the user
//         Scanner sc = new Scanner(System.in);

//         // Prompt the user to input a string
//         System.out.print("Input a string: ");

//         // Read the input string and convert it to a character array
//         char[] letters = sc.nextLine().toCharArray();

//         // Display a message before printing the reversed string
//         System.out.print("Reverse string: ");

//         // Iterate through the character array in reverse order and print each character
//         for (int i = letters.length - 1; i >= 0; i--) {
//             System.out.print(letters[i]);
//         }

//         // Print a newline character to end the output line
//         System.out.print("\n");
//     }
// }

//************************************  Display unique three-digit numberS using 1-9 *********************************
//import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {

//         int amount = 0;
//         for (int i = 1; i <= 9; i++) {
//             for (int j = 1; j <= 9; j++) {
//                 for (int k = 1; k <= 9; k++) {
//                     if (i != j && j != k && k != i) {
//                         amount = amount + 1;
//                         System.out.println(i + "" + j + "" + k);

//                     }
//                 }
//             }
//         }

//         System.out.println("Total 3 digit numbers = " + amount);
//     }
// }

// ************************************************** ASCII CODE *****************************************************

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         for (char i = 'A'; i <= 'z'; i++) {
//             if (!(i < 'a' && i > 'Z')) {
//                 System.out.println(i + "=" + (int) i);
//             }
//         }

//     }
// }

// ********************************************* twinkle twinkle ***************************************************

// public class problem_practise {
//     public static void main(String[] args) {
//         // Display a pattern of a nursery rhyme.
//         System.out.println(
//                 "\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");
//     }
// }

//***************************** Accept an integer (n) and computes the value of n+nn+nnn *****************************

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Take an integer : ");
//         int n = sc.nextInt();
//         System.out.printf("%d + %d%d + %d%d%d \n", n, n, n, n, n, n);
//     }
// }

// ***************************************** PRINT ODD NUMBERS ******************************************************

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Print number from : ");
//         int m = sc.nextInt();
//         System.out.println("Print number to : ");
//         int n = sc.nextInt();
//         int amount = 0;
//         for (int i = m; i <= n; i++) {
//             if (i % 2 == 0) {
//                 continue;
//             } else {
//                 amount = amount + 1;
//                 System.out.println(i);
//             }
//         }
//         System.out.println("Total count = " + amount);
//     }
// }

//***************************************   To convert a string to an integer  ****************************************

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Provide a String : ");
//         String string1 = sc.nextLine();
//         int result = Integer.parseInt(string1);
//         System.out.println("Converted to integer = " + result);
//     }
// }

//************ Calculate the sum of two integers and return true if the sum is equal to a third integer *************

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Input the first number: ");
//         int x = in.nextInt();
//         System.out.print("Input the second number: ");
//         int y = in.nextInt();
//         System.out.print("Input the third number: ");
//         int z = in.nextInt();
//         System.out.print("The result is: " + sumoftwo(x, y, z));
//         System.out.print("\n");
//     }
//     public static boolean sumoftwo(int p, int q, int r) {
//         return ((p + q) == r || (q + r) == p || (r + p) == q);
//     }
// }

// ***Accepts three integers from the user and returns true if two or more of them have the same rightmost digit *****

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Input the first number: ");
//         int x = in.nextInt();
//         System.out.print("Input the second number: ");
//         int y = in.nextInt();
//         System.out.print("Input the third number: ");
//         int z = in.nextInt();

//         System.out.println("The result is : " + test_last_digit(x, y, z));

//     }

//     public static boolean test_last_digit(int x, int y, int z) {
//         return (x % 10 == y % 10) || (y % 10 == z % 10) || (z % 10 == x % 10);
//     }
// }




// ************************************** To insert a word in the middle of another string *************************************

// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         String name1 = "Khandekar Masud";
//         String word = "Md";
//         String result = name1.substring(0,10) + word + name1.substring(9);

//         System.out.println(result) ;
//     }
// }




// **********************   create another string of 4 copies of the last 3 characters of the original string ********************************

// public class problem_practise {
//     public static void main(String[] args) {
//         String name = "Python 3.0";

//         String last_three_characters = name.substring(name.length() - 3);
//         System.out.println(last_three_characters);
//         for (int i=0; i<=4; i++) {
//             System.out.print(last_three_characters);

        
//         }
//     }
// }



// **************** concatenation of the two strings except removing the first character of each string *************************************

// public class problem_practise {
//     public static void main(String[] args) {
//         String name1= "khandekar";
//         String name2 = "Masud";
//         System.out.println(name1.substring(1) + name2.substring(1));
//     }
// }

// ***************************   test if 10 appears as the first or last element of an array of integers ***********************************
    
// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         int [] list = {10, 20, 30, 40, 50,10 };
        
//         boolean result = (list[0] == 10 || list[list.length - 1] == 10);

//         System.out.println(result);
//     }
// }




// *************************  to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays. *****************

// import java.util.Arrays;

// public class problem_practise {
//     public static void main(String[] args) {
//         int[] array1 = {50, -20, 0};
//         int[] array2 = {5, -50, 10};

//         System.out.println("Array1: " + Arrays.toString(array1));
//         System.out.println("Array2: " + Arrays.toString(array2));
//         int[] array_new = {array1[0], array2[2]};	

//         System.out.println("New Array: " + Arrays.toString(array_new));
//     }
// }




// *********** test that a given array of integers of length 2 contains a 4 or a 7 *************************************************************

// public class problem_practise {
//     public static void main(String[] args) {
//         int [] array = {8, 6};

//         boolean result = ((array[0]==4 || array[1]==4) || (array[0]==7 || array[1]==7));
//          System.out.println(result);


//     }
// }




// **********************  to rotate an array (length 3) of integers in the left direction  ******************

// import java.util.Arrays;

// public class problem_practise {
//     public static void main(String[] args) {
//         int[] array = {20, 30, 40}; 
//         System.out.println("Original Array : " + Arrays.toString(array) );
//         int[] new_array = {array[1], array[2], array[0]};
//         System.out.println("Rotated Array  : " + Arrays.toString(new_array)); 
//     }
// }




// ******************************* swap the first and last elements of an array *********************************
// import java.util.Arrays;
// public class problem_practise {
//     public static void main(String[] args) {
//         int [] array = {10,20,30,40,50};
//         System.out.println("Original array =" + Arrays.toString(array));

//         int a = array[0];
//         int b = array[array.length-1];

//         array [0] = b;
//         array [array.length-1] = a;

//         System.out.println("Transformed array = " + Arrays.toString(array));

//     }
// }



// ******************* multiply the corresponding elements of two integer arrays *****************************
// Sample Output:       Array1: [1, 3, -5, 4]          Array2: [1, 4, -5, -2]
//..................... Result: 1 12 25 -8......................................................................



// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         int [] arr1 = {1, 3, -5, 4};
//         int [] arr2 = {1, 4, -5, -2};

//         for (int i=0; i<arr1.length; i++) {
//             int num1 = arr1[i];
//             int num2 = arr2[i];
//             int result = num1 * num2;
            
//            System.out.print(result+ " " );

//         }
        
//         }
    
// }


// *****************************************************************************************************************

//
// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
    

//         String newstr = str.substring(str.length() - 3);

//         System.out.println(newstr+str+newstr);

        
//     }
// }

// *********************************************************************************************************************


//  Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and 
//  add 1 if it is odd. Repeat the process until n = 1

// import java.util.Scanner;

//     public class problem_practise {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double n = sc.nextDouble();
        
//         while (n!=1) {
//             if (n%2 == 0) {
//                 n = n/2;
//             }
//             else {
//                 n = (n*3)+1;
//             }

//              System.out.println("The value of n is "+ n);
//         }
        
//     }
// }

//******************************************************************************************************************* */


// Write a Java program to get the current system environment and system properties

// import java.lang.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         // Print a message indicating the display of the current system environment
//         System.out.println("\nCurrent system environment:");

//         // Retrieve and print the system environment variables using System.getenv()
//         System.out.println(System.getenv());

//         // Print a message indicating the display of the current system properties
//         System.out.println("\n\nCurrent system properties:");

//         // Retrieve and print the system properties using System.getProperties()
//         System.out.println(System.getProperties());
//     }
// }

//*********************************************************************************************************************** */

// ***** Write a Java program to count the number of even and odd elements in a given array of integers **************
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx
// import java.util.*;
// public class problem_practise {
//     public static void main(String[] args) {
//         int[] intArray = {233,456,334,566,56,457,434,565,98,77,91};
//         // String StringArray = Arrays.toString(intArray);
//         int countOfEvenNumber =0 , countOfOddNumber =0;
//         for (int i=0; i<intArray.length; i++) {
//             if (intArray[i]%2 == 0) {
//                 countOfEvenNumber++ ;
//             } else {
//                 countOfOddNumber++ ;
//             }
//         }
//     }
// }

// *********************************************************************************************************************


// ******* Write a Java program to test if an array of integers contains 
//an element 10 next to 10 or an element 20 next to 20, but not both
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// public class problem_practise {
//     public static void main(String[] args) {
//         int[] array = {10,10,4,6,9,35,24,20,20};
        
//         for (int i=0; i<array.length; i++) {
//             if (array[i]==10 && array[i+1]==10) {
//                 System.out.println("True");
//             } 
//             else {
//                 System.out.println("False");
//             }
        
//         }
//     }    
// }


// ********************************************************************************************************************

// ***************************************** ARRAY LEFT SHIFT ************************************************
// import java.util.*;

// public class problem_practise {
//     public static void main(String[] args) {
//         int[] array = {11, 15, 13, 10, 45, 20};
//         System.out.println("Original Array: "+Arrays.toString(array)); 
        
//         if (array.length > 1) {
//             int first = array[0];

//             // Shift elements to the left by one position
//             for (int i = 1; i < array.length; i++)
//                 array[i-1] = array[i];

//             // Move the first element to the end of the array
//             array[array.length - 1] = first;

//             System.out.println("New Array: "+Arrays.toString(array)); 
//         }
//     }
// }



