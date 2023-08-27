import java.util.Scanner;
public class Java_05_Taking_Input {
    public static void main(String[] args) {
        System.out.println(" Taking Input from the User  ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number 1 ");
        int a = sc.nextInt();
        System.out.println(" Enter Number 2 ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(" The sum of these number is");
        System.out.println(sum);

    }
}
