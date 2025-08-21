package Practice;

public class Triangle_Pattern_3 {
    /*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

     */

    public static void main(String[] args) {

        int num = 4, i, j, count=1;

        for(i=1; i<=num; i++){

            for(j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }



    }
}
