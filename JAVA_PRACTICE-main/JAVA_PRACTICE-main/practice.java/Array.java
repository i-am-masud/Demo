// public class Array {
//     public static void main(String[] args) {
//         int n = sc.nextInt();
//         int[] nArr = new int[n];
//         for (int i = 0; i < n; i++) {
//             nArr[i] = sc.nextInt();
//         }
//         System.out.println("Array :" + nArr.toString());
//         double sum;
//         for (int i=0; i<nArr.length; i++) {
//             sum = sum+nArr[i];
//         }
//         double avarage = sum/n;
//         System.out.println(avarage);
//     }
    
// }


// ********************* Write a Java program to sort a numeric array and a string array. ************************
// import java.util.Arrays;
// public class Array {
//     public static void main(String[] args) {
//         int[] intArray = {1,4,3,7,5,9,2,6,8};

//         String[] stringArray = {"g","a","d","c","e","b","f"};

//         System.out.println(Arrays.toString(stringArray));    // ORIGINAL STRING  ARRAY
//         Arrays.sort(stringArray);
//         // Arrays.toString(stringArray);
//         System.out.println(Arrays.toString(stringArray));    // AFTER SORTING

//         System.out.println(Arrays.toString(intArray));       // ORIGINAL INT ARRAY
//         Arrays.sort(intArray);
//         // Arrays.toString(stringArray);
//         System.out.println(Arrays.toString(intArray));       // AFTER SORTING

//     }
// }





//*********************************** Write a Java program to sum values of an array ***************************


// public class Array{
//     public static void main(String[] args) {
//         int[] array = {1,5,3,2,6,7,4,3};
//         int sum =0;
//         for (int i=0; i<array.length; i++) {
//             sum += array[i];
            
//         }
//         System.out.println("The sum is " + sum);
//     }
// }


// ******************** 

public class Array {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} ;

        findindex(index);
    }

    public static int findindex(int index) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == 36) {
                System.out.println(array[i]);
            } else {
                return -1;
            }
        }
    }
}



// ******************