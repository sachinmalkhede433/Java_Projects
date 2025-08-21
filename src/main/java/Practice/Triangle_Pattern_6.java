package Practice;

public class Triangle_Pattern_6 {
    /*

         *
        * *
       * * *
      * * * *
     * * * * *

     */
    public static void main(String[] args) {

        int num = 5, i, j;

        for(i=1; i<=num; i++){

            for(j=1; j<=num-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
