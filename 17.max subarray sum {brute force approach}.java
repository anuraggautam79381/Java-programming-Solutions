public class main {
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        maxsubarraysum(arr);
    }
    static void maxsubarraysum(int[] arr){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
     //start
     for(int i=0;i<arr.length;i++){
      int start=i;
      //end
      for(int j=i;j<arr.length;j++){
      int end=j;
      currsum=0;
      for(int k=start;k<=end;k++){
       currsum+=arr[k];
      }
      if(maxsum<currsum){
      maxsum=currsum;
        }
       }
      }
      System.out.println("maximum is " + maxsum);
    }
}
