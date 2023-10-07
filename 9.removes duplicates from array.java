public class main{
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30,40};
        int res=remduplicates(arr);
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int remduplicates(int[] arr){
      int res=0;
      for(int i=1;i<arr.length;i++){
       if(arr[res]!=arr[i]){
          res++;
        arr[res]=arr[i];
       }
      }
      return res+1;
    }
}