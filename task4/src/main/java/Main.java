import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("первое слово ");
        String first =in.nextLine();
        System.out.println("Второе слово ");
        String second=in.nextLine();
        if (new FirstSecondEquals().FirstSecondEquals(first, second).equals("ok")) {
            System.out.println(new FirstSecondEquals().FirstSecondEquals(first, second));
        }
        else{
            System.out.println("ko");
        }
    }
}

