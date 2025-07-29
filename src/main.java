

public class main {



    //Find smallest or largest index and value in array

    public static void main(String[] args){

        int[] nums=new int[]{4,-1,44,36,22,483,284};

        int minvalue=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;

        int[] largeindex=new int[1];
        int[] smallerindex=new int[1];

        for (int i=0;i<nums.length;i++){

            if (large<nums[i]){
                large=nums[i];
                largeindex=new int[i];

            } else if (nums[i]<minvalue) {
               minvalue=nums[i];
               smallerindex=new int[i];
            }

        }
        System.out.println("The small number is: "+minvalue+" & indexnumber: "+smallerindex.length);
        System.out.println("\n");
        System.out.println("The large number is: "+large+" & indexnumber: "+largeindex.length);




    }



}
