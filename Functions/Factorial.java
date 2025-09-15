import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+fact(num)); 
    }
    private static int fact(int num){
        int f=1;
        for(int i=num;i>=1;i--){
            f*=i;
        }
        return f;
    }
}
