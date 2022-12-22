import java.util.Scanner;
public class Array1 {

    static int getBiggest(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }

        }
        return big;
    }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter values");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int big = getBiggest(arr);

            System.out.println(big);
        }


}

