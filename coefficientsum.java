import java.util.Scanner;

public class coefficientsum{
    public static void main(String[] args) {

            int a, total = 0;

            Scanner input = new Scanner(System.in);


            do {

                System.out.print("Enter a number : ");

                a = input.nextInt();

                if(a % 4 == 0){

                    total += a;
                }
            } while(a % 2 == 0);

            System.out.print("Total : " + total);
    }
}
