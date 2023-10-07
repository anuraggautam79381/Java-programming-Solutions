import java.util.Scanner;

public class number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0)
            System.out.println("positive");
        else
            System.out.println("non positive");
    }
}