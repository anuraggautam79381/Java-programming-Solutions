public class main{
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,7};
    int count=0;
    int odd=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            count++;
        }
        else{
            odd++;
        }
    }
    System.out.println("even is:"+count+"\nodd is:"+odd);
 }
}

