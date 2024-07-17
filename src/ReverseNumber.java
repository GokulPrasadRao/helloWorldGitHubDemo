import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int ori, temp, rev;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        ori = scanner.nextInt();
        rev = 0;
        while (ori != 0){
            temp = ori % 10;
            rev = rev * 10 + temp;
            ori = ori/10;
        }
        System.out.println(rev + " This is the reversed version of the number ");
    }
}
