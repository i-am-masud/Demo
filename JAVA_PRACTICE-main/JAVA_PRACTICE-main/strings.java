// import java.util.*;

// public class strings {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println("YOUR NAME IS " + name);
// }
// }

// import java.util.*;

// public class strings {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Type First Name ");
// String FirstName = sc.nextLine();
// System.out.println("Type Second Name ");
// String LastName = sc.nextLine();
// String FullName = FirstName + " " + LastName;
// System.out.println("Your Name is " + FullName);
// System.out.println(FullName.length());
// for (int i = 0; i < FullName.length(); i++) {
// System.out.println(FullName.charAt(i));
// }
// }
// }

// public class strings {
// public static void main(String[] args) {
// String name1 = "masud";
// String name2 = "masud";
// if (name1.compareTo(name2) == 0) {
// System.out.println("strings are equal");
// } else {
// System.out.println("STRINGS ARE NOT EQUAL");
// }
// }
// }
// import java.util.*;

// public class strings {
// public static void main(String[] args) {
// String sentence = "My name is Md Masud";
// String name = sentence.substring(11, sentence.length());
// System.out.println(name);
// }
// }

// import java.util.*;

// public class strings {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder("Masud");
//         System.out.println(sb);
//         sb.setCharAt(3, 'i');
//         System.out.println(sb);
//         sb.setCharAt(3, 'u');
//         System.out.println(sb);
//         sb.insert(0, 'M');
//         System.out.println(sb);
//         sb.delete(0, 1);
//         System.out.println(sb);
//     }
// }

// import java.util.*;

// public class strings {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("M");
//         sb.append("a");
//         sb.append("s");
//         sb.append("u");
//         sb.append("d");
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }

import java.util.*;

public class strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("masud");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

            System.out.println(sb);

        }
    }
}

// public class strings {
// public static void main(String[] args) {
// int a = 10;
// int b = 0;
// b = a++;
// // System.out.println(a);
// System.out.println(b);
// }
// }
