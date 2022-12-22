import java.util.Scanner;
public class solution
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();  //enter desired array size
        System.out.println("enter the elements in the array  ");
        int[] arr=new int[size];  //allocation and declaration
        int max = arr[0];


            for( int i=0;i< arr.length;i++)
            {
                arr[i] = sc.nextInt();  // initialization of array

            }
                for (int i = 0; i < arr.length; i++)
                {

                    if (arr[i] > max)
                    {
                        max = arr[i];
                    }
                }
        System.out.println("maximum element of the array "+ max);
    }

}

