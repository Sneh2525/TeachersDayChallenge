
import java.util.Scanner;
 
public class Watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        System.out.println(w % 2 == 0 && w > 2 ? "YES" : "NO");
    }
}
