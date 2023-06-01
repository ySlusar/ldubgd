import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедіть 5 слів: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String word4 = input.next();
        String word5 = input.next();

        String allWord = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);

        System.out.println(allWord);

    }
}