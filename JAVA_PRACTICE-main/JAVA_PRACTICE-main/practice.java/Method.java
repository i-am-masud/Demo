
// ***************************************** AVARAGE OF 3 NUMBERS *********************************************

// import java.util.Scanner;
// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Print 1st number : ");
//         double a = sc.nextDouble();
//         System.out.println("Print 1st number : ");
//         double b = sc.nextDouble();
//         System.out.println("Print 1st number : ");
//         double c = sc.nextDouble();
        
//         double avg = avarage(a,b,c);
//         System.out.println("Avarage of 3 numbers is " + avg );

//     }


// public static double avarage(double a, double b, double c) {
//     double avarage = (a+b+c)/3 ;
//     return avarage;
// }
// }




// ******************** Write a Java method to display the middle character of a string ***********************

// import java.util.Scanner;

// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Print a string - ");
//         String str = sc.nextLine();

//         Midchar(str);

//     }

//     public static void Midchar(String str) {
//         char[] ch = str.toCharArray();

//         if (ch.length%2 == 0) {
//             System.out.println("Mid chararcters : " + ch[(ch.length/2)-1]+ ch[ch.length/2] );
//         } else {
//             System.out.println("Mid chararcters : " + ch[ch.length/2] );
//         }
    
//         }
//     }



// **************************  Write a Java method to count all vowels in a string *************************

// import java.util.*;

// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         countVowels(str);
//     }

//     public static void countVowels(String str) {
//         char[] ch = str.toCharArray();
        
//         int counter = 0;
//         for (int i=0; i<ch.length; i++) {
//             if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
//                 counter ++;
//             }
            
//         }
        

//         System.out.println("Vowel count =" + counter);
//     }
// }




// *************************** Write a Java method to compute the sum of digits in an integer ********************

// import java.util.Scanner;
// public class Method  {

//   public static void main(String[] args)
//     {
//       Scanner in = new Scanner(System.in);
//       System.out.print("Input an integer: ");
//       int digits = in.nextInt();
// 	  System.out.println("The sum is " + sumDigits(digits));
//     }

//  public static int sumDigits(long n) {
// 		int result = 0;
		
// 		while(n > 0) {
// 			result += n % 10;
// 			n /= 10;
// 		}
// 		return result;
// 	}	
//  }



// ***************************************** CHECK FOR LEAP-YEAR ********************************************

// import java.util.Scanner;

// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter an year :");
//         int year = sc.nextInt();

//         leapyear(year);


//     }

//     public static void leapyear(int year) {
//         if ((year%4 == 0 && year%100 !=0) || year%400 == 0) {
//             System.out.println("This is a leap year");
//         } else {
//             System.out.println("This is not a leap year");
//         }
//         // return leapyear(year);2023

//     }
//     }



// ************************************ PASSWORD CHECK **************************************************

// import java.util.Scanner;

// public class Method {
    
// // public static final int PASSWORD_LENGTH = 8;

// public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print(
//                 "1. A password must have at least eight characters.\n" +
//                 "2. A password consists of only letters and digits.\n" +
//                 "3. A password must contain at least two digits \n" +
//                 "Input a password (You are agreeing to the above Terms and Conditions.): ");
//         String s = input.nextLine();

//         if (is_Valid_Password(s)) {
//             System.out.println("Password is valid: " + s);
//         } else {
//             System.out.println("Not a valid password: " + s);
//         }

//     }

//     public static boolean is_Valid_Password(String password) {

//         if (password.length() < 8) return false;

//         int charCount = 0;
//         int numCount = 0;
//         for (int i = 0; i < password.length(); i++) {

//             char ch = password.charAt(i);

//             if (is_Numeric(ch)) numCount++;
//             else if (is_Letter(ch)) charCount++;
//             else return false;
//         }


//         return (charCount >= 2 && numCount >= 2);
//     }

//     public static boolean is_Letter(char ch) {
//         ch = Character.toUpperCase(ch);
//         return (ch >= 'A' && ch <= 'Z');
//     }


//     public static boolean is_Numeric(char ch) {

//         return (ch >= '0' && ch <= '9');
//     }

// }




// ********************************* TRIANGLE AREA ************************************************************


// import java.util.Scanner;

// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Base = ");
//         double base = sc.nextDouble();
//         System.out.print("Height = ");
//         double height = sc.nextDouble();

//         areaCalculate(base, height);
//     }

//     public static void areaCalculate(double base, double height) {
//         System.out.print("Area of the triangle = " + (0.5 * base * height) + " ");

//     }
// }


// ******** Accept three integers and checks whether they are consecutive or not. Returns true or false ***********

// import java.util.Scanner ;

// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Number 1 = ");
//         int a = sc.nextInt();
//         System.out.print("Number 2 = ");
//         int b = sc.nextInt();
//         System.out.print("Number 3 = ");
//         int c = sc.nextInt();

//         consecutive(a,b,c);

//     }

//     public static void consecutive(int a, int b, int c) {
//         if ((b-a) == 1 && (c-b) == 1 ) {
//             System.out.println("True");
//         } else {
//             System.out.println("False");
//         }
//     }
// }


// ********** Write a Java method for extracting the first digit from a positive or negative integer **************************

// import java.util.Scanner;

// public class Method {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Print an integer = ");
//         int number = sc.nextInt();

//         extract(number);


//     }

//     public static void extract (int number) {
//         char [] array = number.toCharArray();
//         System.out.println("First integer = " + array[0]);

    

//     }
// }


// string_name.matches("^[a-zA-Z0-9]+$");


public class Method {
    public static void main(String[] args) {
        int a = 30;
        String a1 = "psoitive";
        String a2 = "negative";
        String result = (a>0) ? a1 : a2;

       System.out.println(result);
    }
}