import java.util.Scanner;
public class FactorialMain {
    public static void main(String[] arg){
        final Scanner sc = new Scanner((System.in));
        System.out.print("Enter a number: ");
        final int n = sc.nextInt();
        sc.close();

        for (int i = 1; i<= n; i++){
            long result = getFactorial(i);
            if (i<n) {
                System.out.printf("Factorial of %d = %d%n",i,result);
            }
            else {
                System.out.printf("Factorial of %d = %d",i,result);
            }
        }
    }
    private static long getFactorial(final int n){
        int result = 1;
        for (int i = 1; i<= n; i++){
        result = result * i;
        }
        return result;
    }
}
