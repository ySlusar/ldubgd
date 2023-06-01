public class Task2 {
    public static void main(String[] args) {
        int n = 192;
        int fNum = n / 100;
        int sNum = (n % 100) / 10;
        int tNum = n % 10;
        if (fNum >= sNum && fNum >= tNum) {
            System.out.println("Перше число найбільше: " + fNum);
        } else if (sNum >= fNum && sNum >= tNum) {
            System.out.println("Друге число найбільше: " + sNum);
        } else {
            System.out.println("Третє число найбільше" + tNum);
        }
    }
}
