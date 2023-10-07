import java.util.Scanner;

public class ticket{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        char gender='f';
        if(gender=='m')
        {
            if(age>50)
            System.out.println("ticket is Rs.10 for male ");
        else
            System.out.println("ticket is Rs.20 for rest male");
       }
       else{
          if(age<30)
            System.out.println("ticket is Rs.50 for female");
        else
            System.out.println("ticket is Rs.40 for rest female");
       }
}
}