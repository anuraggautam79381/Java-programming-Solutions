public class main {
  public static void main(String[] args){  
   int[] arr={1,2,3,4,5,6};
   System.out.println(arraysum(arr));
 }
 static int arraysum(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
    sum=sum+arr[i]; 
   }
   return sum;
 }
}