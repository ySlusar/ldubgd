import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 5 слів: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String word4 = input.next();
        String word5 = input.next();

        String allWords = word1.substring(0,1).concat(" ").concat(word2.substring(0,1)).concat(" ").concat(word3.substring(0,1)).concat(" ").concat(word4.substring(0,1)).concat(" ").concat(word5.substring(0,1));

        System.out.println(allWords.toLowerCase());
    }
}
