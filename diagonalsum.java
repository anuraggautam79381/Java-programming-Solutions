public class diagonalsum {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
      System.out.println(sumdiagonal(arr));
    }
    static int sumdiagonal(int[][] arr){
        //0(n) time complexity
        int sum=0;
    for(int i=0;i<arr.length;i++){
          sum+=arr[i][i];
           if(i!=arr.length-i-1){
            sum+=arr[i][arr.length-i-1];
           }
        }
        return sum;
    }
}
 