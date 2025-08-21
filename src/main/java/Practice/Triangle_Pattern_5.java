package Practice;

public class Triangle_Pattern_5 {
    /*

         *
        **
       ***
      ****
     *****

     */
    public static void main(String[] args) {

        int num = 5, i, j;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num- i; j++) {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
