public class Insertion_sort {
    public static void main(String[] args) {
         int ar[]={2,10,8,7};
        int n=ar.length;
        Insertion_sort_Algo(ar,n);
      for(int i:ar){
        System.out.print(i+" ");
      }
    }

    public static void Insertion_sort_Algo(int ar[],int n){
        for(int i=1;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=key;
    }
}

}
