import java.util.Arrays;

public class Bubble_sort {
    public static void main(String args[]){
        int ar[]={2,10,8,7};
        int n=ar.length;
        Bubble_sort_Algo(ar,n);
      for(int i:ar){
        System.out.print(i+" ");
      }
    }

    public static void Bubble_sort_Algo(int ar[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
}

}
