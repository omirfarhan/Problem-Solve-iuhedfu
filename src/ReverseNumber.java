import javax.swing.*;

public class ReverseNumber {

    //reverse number

    public static void main(String[] args){
       int[] arr=new int[]{1,3,5,7,9};
       ReverseNumber re=new ReverseNumber();
       re.reversenumber(arr);

       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }


    }

    public void reversenumber(int[] arr){

        int start=0,end=arr.length-1;

        int temp;
        while (start<=end){

             temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }


    }
}
