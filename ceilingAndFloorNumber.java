public class ceilingAndFloorNumber{
    public static int floor(int[] nums, int target){
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target >= nums[mid]){
                start=mid+1;
            }else if(target <= nums[mid]){
                end=mid-1;
            }
        }
        return nums[end];
    }
    
    static int ceiling(int[] nums, int target){
        int start=0, end=nums.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target >= nums[mid]){
                start=mid+1;
            }else if(target <= nums[mid]){
                end=mid-1;
            }
        }
        return nums[start];
    }

     public static void main(String []args){
        int[] nums = {2,3,5,9,12,15,17,20};
        System.out.println(floor(nums, 13));
        System.out.println(ceiling(nums, 13));
     }
}