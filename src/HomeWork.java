import javax.swing.*;

public class HomeWork {


    //WAF to calculate sum and product of all numbers in an array
    //WAF To swap the max and min number of an array
    //WAF to print intersection of 2 arrays

    public static void main(String[] args){

        int[] arr=new int[]{
                2,3,4,5,6
        };

        //intersection of array


        HomeWork work=new HomeWork();
        work.suminarray(arr);
        work.swapinmaxmin(arr);


        System.out.println("Swap number: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            } else if (smallest>arr[i]) {
                smallest=arr[i];
            }
        }
        System.out.println("The Smallest value is: "+smallest);
        System.out.println("The largest value is: "+largest);




    }



    //swapinmaxorin
    public void swapinmaxmin(int[] arr){

        int start=0; int end=arr.length-1;
        int swap;
        while (start < end){
            swap=arr[start];
            arr[start]=arr[end];
            arr[end]=swap;

            start++;
            end--;

        }

    }


// sum all array number
    public void suminarray(int[] arr){

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum is: "+sum);

    }

}
