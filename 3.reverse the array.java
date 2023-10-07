import java.util.Arrays;
public class main {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,7};
     reversearray(arr);
      System.out.print(Arrays.toString(arr));
    }
    static void reversearray(int[] arr){
     int start=0;
     int end=arr.length-1;
     while(start<end){
     swapping(arr,start,end);
     start++;
     end--;
    }
}
    static void swapping(int[] arr,int index1,int index2){
        for(int i=0;i<arr.length;i++){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
}
