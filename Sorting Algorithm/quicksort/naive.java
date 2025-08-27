import java.util.Arrays;

class naive{
    public static void main(String[] args) {
        int ar[]={5,13,6,9,12,11,8};
        int low=0;
        int high=ar.length-1;
        int pivot=6;
        int result[]=Partition(ar,low,high,pivot);
        System.out.println(Arrays.toString(result));
    }

    public static int [] Partition(int ar[],int low,int high,int pivot){
        
        int index=0;
        int temp[]=new int[high-low+1];
        for(int i=low;i<=high;i++){
            if(ar[i]<=ar[pivot] && i!=pivot){
                temp[index]=ar[i];
                index++;
                
            }
           
        }
         temp[index++]=ar[pivot];
           for(int i=low;i<=high;i++){
            if(ar[i]>ar[pivot]){
                temp[index]=ar[i];
                index++;
                
            }
            
        }
          for(int i=low;i<=high;i++){
             ar[i]=temp[i-low];
            
        }
        return ar;

    } 
}