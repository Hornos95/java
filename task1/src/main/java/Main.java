import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Система счисления в которую необходимо перевести ");
        String name1 = in.nextLine();
        System.out.println("введите число  ");
        int number = in.nextInt();
        System.out.println(new convertNumberToOtherNumberSystem().convertNumber(number, name1));

    }
}
