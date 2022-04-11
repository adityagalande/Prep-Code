// Find position of an element in a sorted array of infinite numbers
public class findPositionInSortedInfiniteArray{
    
    static int findPos(int[] nums, int target){
        int s=0, e=1;
        
        while(target > nums[e]){
            int temp = e+1;
            e = e+((e-s)+1)*2;
            s = temp;
        }
        
        return binarySearch(nums, target, s, e);
    }
    
    static int binarySearch(int[] nums, int target, int s, int e){
        
        while(s<=e){
            int m=s+(e-s)/2;
            if(target > nums[m]){
                s=m+1;
            }else if(target < nums[m]){
                e=m-1;
            }else{
                return m;
            }
        }
        return -1;
    }

     public static void main(String []args){
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 248, 315, 320, 489, 543, 737, 777};
        int target = 315; 
        System.out.println(findPos(arr,target));
     }
}