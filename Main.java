import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        int r, temp;
        int n;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;


        }
        if(temp==sum)
        {
            System.out.println("palindrome");

        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
