package Deutsche;

import java.util.Scanner;

public class Prime_Number
{

        static int count = 0;
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter first number- ");
            int num= sc.nextInt();

            for(int i=1; i<=num; i++) {

                if(num%i==0) {
                    count++;
                }

            }
            if(count==2) {
                System.out.println("Given number is Prime");
            }else

                System.out.println("Not Prime");

        }

    }

