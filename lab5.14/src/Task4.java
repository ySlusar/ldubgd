import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 2 імені: ");
        String word1 = input.next();
        String word2 = input.next();


        boolean ww = word1.equalsIgnoreCase(word2);

        System.out.println(ww);

    }
}
