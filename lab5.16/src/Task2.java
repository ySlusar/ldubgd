public class Task2 {
    public static void main(String[] args) {
        int p, s, site1, site2, site3, pif;
        site1 = 3;
        site2 = 4;
        site3 = (int) Math.sqrt(site1*site1 + site2*site2);
        p = site1 + site2 + site3;
        s = (site1 * site2)/2;
        System.out.println("Сторорни трикутника: " + site1 + " см " + site2 + " см " + site3 + " см.");
        System.out.println("Периметр трикутника: " + p + " см.");
        System.out.println("Площа трикутника:" + s + " см^2");
    }
}
