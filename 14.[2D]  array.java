import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            /* 1 2 3 4
               3 4
               5 6 7 */
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
