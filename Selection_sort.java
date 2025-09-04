public class Selection_sort {
    public static void main(String[] args) {
        int ar[]={2,10,8,7};
        int n=ar.length;
        Selection_sort_Algo(ar,n);
      for(int i:ar){
        System.out.print(i+" ");
      }
    }

    public static void Selection_sort_Algo(int ar[],int n){
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(ar[j]<ar[min_index]){
                   min_index=j;
                }
            }
            int temp=ar[i];
            ar[i]=ar[min_index];
            ar[min_index]=temp;
        }
}

    
}
