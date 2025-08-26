package ArrayDSA;

// package ArrayDsa;

public class Subarray_Multiply {
    public static void main(String[] args) {
           int ar[]={1,2,3,4};
    
int result[]=   fun1(ar);
 for(int i:result){
     System.out.print(i+" ");
 }
 
    }

      static  int [] fun1(int ar[]){
                int n=ar.length;
   int size=n*(n+1)/2;
   int result1[]=new int[size];
    

  int k=0;
        for(int i=0;i<n;i++){
              int product=1;
            for(int j=i;j<n;j++){
           product*=ar[j];
           result1[k++]=product;
            }
        }
      return result1;
    }
}

