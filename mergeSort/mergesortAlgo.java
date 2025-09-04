package mergeSort;

import java.util.Arrays;

public class mergesortAlgo {
    public static void main(String args[]){
        int nums[]={5,2,3,1};
        int result[]=sortArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int [] sortArray(int nums[]){
        int n=nums.length;
        mergesort(nums, 0,n-1);
        return nums;


    }

    public static void mergesort(int nums[],int left,int right){
        if(left>=right){
            return ;
        }
        int mid=left+(right-left)/2;
        mergesort(nums, left, mid);
        mergesort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }
     public static void merge(int nums[],int left,int mid,int right){
        int temp[]=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }

        while ((i<=mid)) {
            temp[k++]=nums[i++];
            
        }
        
        while ((j<=right)) {
            temp[k++]=nums[i++];
            
        }

        for(int p=0;p<temp.length;p++){
            nums[left+p]=temp[p];
        }
    }
}
