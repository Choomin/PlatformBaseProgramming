import java.util.Scanner;
public class MathMain {
    public static void main(String[] arg){
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter a begin number: ");
        final int begin = sc.nextInt();
        System.out.println("Enter an end number: ");
        final int end = sc.nextInt();
        sc.close();
        long sum = getSumBetween(begin,end);
        System.out.printf("Sum between %d and %d : %,d %n",begin,end,sum);
        long product = getProductBetween(begin,end);
        System.out.printf("Product between %d and %d : %,d%n",begin,end,product);
    }
    private static long getSumBetween(int n1, int n2){
        long sum = 0 ;
        for ( int i =n1; i<= n2; i++){
            sum = sum + i;
        }
        return sum;
    }
    private static long getProductBetween(int n1, int n2){
        long product = 1;
        for (int i = n1; i<= n2; i++){
            product = product * i;
        }
        return product;
    }
}
