import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a text");
        Scanner scanner = new Scanner(System.in);

        String original = scanner.nextLine();

        StringBuilder rev = new StringBuilder(original);
        rev.reverse();

        System.out.println(rev);

    }
}
