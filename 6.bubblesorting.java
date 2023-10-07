import java.util.*;
public class bubblesorting {
    public static void main(String[] args){
     int[] arr={5,4,1,3,2};
     basicsorting(arr);
     printrr(arr);
    }
    static void basicsorting(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
    }
    }
    static void printrr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
