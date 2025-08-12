import java.util.Scanner;

public class Domino{
    public static void main (String[] args){
        Scanner scn= new Scanner(System.in);
        int M = scn.nextInt();
        int N = scn.nextInt();
        int Result = (M*N)/2 ;
        System.out.println(Result);
        
    }
}