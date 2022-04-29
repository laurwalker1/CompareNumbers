import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter first number: ");
        num1 = input.nextInt();

        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        System.out.println("Enter a third number: ");
        num3 = input.nextInt();

        if (num1 == num2)
            System.out.printf( "%d = %d\n", num1, num2 + num3 );
        if ( num1 != num2 )
            System.out.printf( "%d != %d\n", num1, num2 + num3 );
        if ( num1 < num2 )
            System.out.printf( "%d < %d\n", num1, num2 + num3 );
        if ( num1 > num2 )
            System.out.printf( "%d > %d\n", num1, num2 + num3 );
        if ( num1 <= num2 )
            System.out.printf( "%d <= %d\n", num1, num2 + num3 );
        if ( num1 >= num2 )
            System.out.printf( "%d >= %d\n", num1, num2 + num3 );

    }
}
