import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();
        System.out.println("enter maximum marks");
        int max=sc.nextInt();
        float percentage=((float) marks/max)*100;
        System.out.println("your percentage:"+percentage);
    }
}
