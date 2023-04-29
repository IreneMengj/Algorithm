package ajax;

public class binarySearch {
    public Integer binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return -1;
    }
    public int[] twoPointer(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        while(left<right){
            int sum= arr[left]+arr[right];
            if(sum==target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
