package Deutsche;

public class Bubble_sort {
    public static void main(String[] args) {

        int[] num = {1,9,0,35,84,25};

        for(int i=0; i<num.length-1; i++){

            for(int j=0; j<num.length-1; j++){

                if(num[j]>num[j+1]){
                    int temp;
                    temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }

        for(int a:num){
            System.out.print (a + " ");
        }
    }
}
