import java.util.Arrays;

public class Lomuto_Partition {
    public static void main(String args[]){
        int ar[]={10,80,30,70,90,40,50,70};
        int n=ar.length;
        int ans=Lomuto_Partition_FUNC(ar,0,n-1);
        System.out.println("Pivot index: "+ ans);
        System.out.println("Array after partition: "+ Arrays.toString(ar));
    }

    public static int Lomuto_Partition_FUNC(int ar[],int low,int high){
        int pivot=ar[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(ar[j]<pivot){
                i++;
                swap(ar,i,j);
            }
        }
        swap(ar,i+1,high);
        return (i+1);
    }

    public static void swap(int ar[],int i,int j ){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        
    }
}
