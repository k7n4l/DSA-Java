import java.util.Scanner;

public class Report {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Marks of 3 subjects: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total(s1, s2, s3));
        System.out.println("Average of Marks: " + average(s1, s2, s3));
        System.out.println("Grade: " + grade(s1, s2, s3));
        sc.close();
    }

    private static int total(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    private static int average(int a, int b, int c) {
        int avg = (total(a, b, c) / 3);
        return avg;
    }

    private static char grade(int a, int b, int c) {
        int t = total(a, b, c);
        char grd;
        if (t >= 250)
            grd = 'A';
        else if (t >= 200)
            grd = 'B';
        else if (t >= 150)
            grd = 'C';
        else
            grd = 'F';
        return grd;
    }
}
