public class rotatedArray{
    static int findPivot(int[] nums){
        int start=0, end=nums.length-1;
        if(nums.length == 1){
            return start;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[0]){
                start=mid+1;
            }else if(nums[mid] < nums[0]){
                end=mid-1;
            }
        }
        return start;
    }

     public static void main(String []args){
         int[] nums = {8,9,14,16,18,2,3,5,6,7};
         System.out.println(findPivot(nums));
     }
}