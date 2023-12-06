import java.util.Scanner;

public class Function {
public static void PrintMyName(String name) {
System.out.println(name);
return;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String name = sc.next();
PrintMyName(name);

}

}

**************************************************************************************************************
import java.util.*;

public class Function {
public static int SumOfNo(int a, int b) {
int sum = a + b;
return sum;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

int sum = SumOfNo(a, b);
System.out.println("sum of 2 numbers = " + sum);

}
}


//*****************************************************************************************************************

import java.util.*;

public class Function {
    public static void printfactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printfactorial(n);

    }
}