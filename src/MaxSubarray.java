public class MaxSubarray {

    //Maximum subarray

    public static void main(String[] args){

        int[] arr=new int[]{5,4,-1,7,8};

        int maxSub=Integer.MIN_VALUE;

        for(int start=0;start<arr.length;start++){

            int currentSum=0;

            for(int end=start;  end<arr.length; end++){

                currentSum=currentSum+arr[end];
                maxSub=Math.max(currentSum,maxSub);

            }


        }

        System.out.println("Max sum subarray is: "+maxSub);

    }

}
