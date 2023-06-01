import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 2 імені: ");
        String word1 = input.next();
        String word2 = input.next();
        boolean ww = word1.equals(word2);

//        System.out.println(word2);

        if(!ww) {
            System.out.println("Перший рядок більший за другий");
        }
        else {
            System.out.println("Другий рядок більший за перший");
        }
    }
}
