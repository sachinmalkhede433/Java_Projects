package Practice;

public class Triangle_Pattern_4 {
    /*

1
22
333
4444

     */

    public static void main(String[] args) {

        int num = 4, i, j, count = 1;

        for (i = 1; i <= num; i++) {

            for(j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
