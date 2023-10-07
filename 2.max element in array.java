public class main {
 public static void main(String[] args){
   int[] arr={1,2,3,4,5,6,7};
   System.out.println(maxelement(arr));
 }
 static int maxelement(int[] arr){
    int max=arr[0];
   for(int i=0;i<arr.length;i++){
     if(max<arr[i]){
        max=arr[i];
   }
  }
  return max;
 }
}

