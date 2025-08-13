
import java.util.Scanner;

public class Translation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        
        StringBuilder stb= new StringBuilder(s);
        stb.reverse();
        String s1 = stb.toString();
        
        if(s1.equals(t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        scn.close();

    }
}
