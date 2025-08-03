public class MaxSubarray {

    //Maximum subarray

    public static void main(String[] args){

        int[] arr=new int[]{1,2,4};

        int maxSub=Integer.MIN_VALUE;
        int current=0;
        for(int start: arr){
          current=start;
         // maxSub=Math.max(current,maxSub);
          if(current<0){
              current=0;
          }
        }

        System.out.println("Max sum subarray is: "+current);

    }

}
