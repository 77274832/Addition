import java.util.*;

public class sum3 {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int sum1 = a/100;
            int sum2 = a%100;
            int s1 = sum2/10;
            int s2 = sum2%10;
            System.out.println(sum1);
            System.out.println(s1);
            System.out.println(s2);
            int sum = sum1+s1+s2;
            System.out.println(sum);

        }
    }
    
}
