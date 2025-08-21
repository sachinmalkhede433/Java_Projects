package Practice;

public class Triangle_Pattern_2 {
            /*
1
12
123
1234
12345
            */

    public static void main(String[] args) {

        int num = 5, i, j;

        for (i = 1; i <= num; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
