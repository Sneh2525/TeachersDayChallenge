import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalsum=0;
        int n = sc.nextInt();
        int []coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i]=sc.nextInt();
            totalsum += coins[i];
        }
        Arrays.sort(coins);

        for (int i = 0; i < coins.length / 2; i++) {
            int temp = coins[i];
            coins[i] = coins[coins.length - 1 - i];
            coins[coins.length - 1 - i] = temp;
        }
        int mySum = 0;
        int count = 0;

        for (int value : coins) {
            mySum += value;
            count++;
            if (mySum > totalsum - mySum) {
                break;
            }
        }
         System.out.println(count);
    }
}
