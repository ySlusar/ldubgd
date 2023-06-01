import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 3 дробових чисел: ");
        double word1 = input.nextDouble();
        double word2 = input.nextDouble();
        double word3 = input.nextDouble();


        double cWord1 = Math.max(word1, word2);
        double cWord2 = Math.max(cWord1, word3);

        System.out.println(cWord2);
    }
}
