import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" + n + "elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter second size of the array");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("enter" + m + "elements of the array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();

        }
        int[] z = isMerge(arr,arr1);

        for (int j : z) {
            System.out.print(j);
        }
    }

    static int[] isMerge(int[] arr, int[] arr1) {
        int[] c = new int[arr.length + arr1.length];
        System.arraycopy(arr, 0, c, 0, arr.length);
        System.arraycopy(arr1, 0, c, arr.length, arr1.length);
        return c;
    }
}


















