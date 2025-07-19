package Deutsche;

public class trial {
    public static void main(String[] args){

        int[] numbers= {1000,52,8,14,99,277,155,9996};

        int largest = numbers[0];

        for(int i=1; i<numbers.length; i++){

            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }

        System.out.println("Largest number = " + largest);






    }
}
