import java.util.ArrayList;
import java.util.Arrays;

public class Homework2 {
 //System.out.println(arr[i]);
   //Kadane's Algorithm
    public static void main(String[] args){

        int[] arr=new int[]{
                3,4,5,6,7
        };

        for(int start=0;start<arr.length;start++){

            for(int end=start; end<arr.length;end++){

                for(int i=start;i<=end; i++){
                    System.out.print(arr[i]+" "); // এক লাইনে প্রিন্ট
                }

                System.out.println();

            }

        }


    }


}
