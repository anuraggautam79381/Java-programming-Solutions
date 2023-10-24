public class main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
      spiralmatrix(arr);

    }
    static void spiralmatrix(int[][] arr){
    int startrow=0;
    int endrow=arr.length-1;
    int startcol=0;
    int endcol=arr[startrow].length-1;
    //top
    while(startrow<=endrow && startcol<=endcol){
    for(int j=startcol;j<=endcol;j++){
     System.out.print(arr[startrow][j]+" ");
    }
    //right
    for(int i=startrow+1;i<=endrow;i++){
     System.out.print(arr[i][endcol]+" ");
    }
    //bottom
    for(int j=endcol-1;j>=startcol;j--){
        if(startrow==endrow)
            break;
     System.out.print(arr[endrow][j]+" ");
    }
    //left
    for(int i=endrow-1;i>=startrow+1;i--){
           if(startcol==endcol)
            break; 
     System.out.print(arr[i][startcol]+" ");
     }
    startrow++;
    startcol++;
    endrow--;
    endcol--;
    }
    System.out.println();
  }
}
