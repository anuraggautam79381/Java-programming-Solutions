public class second {
    public static void main(String[] args) {
        int[] arr={20,42,6,25,30,88};
        System.out.print(secondlargest(arr)); 
 }
 static int secondlargest(int[] arr){
 int max1=0,max2=0;
 if(arr[0]>arr[1]){
    max1=arr[0];
    max2=arr[1];
 }
    else{
        max1=arr[1];
        max2=arr[0];
    }
    for(int i=2;i<arr.length;i++){
    if(arr[i]>max1){
        max2=max1;
        max1=arr[i];
    }
    else if(arr[i]>max2){
        max2=arr[i];
    }
    }
    return max2;
 }
}
