package Deutsche;

public class Largest_Number_From_Array {
    public static void main(String[] args){

        int[] arr = {10,05,80,14,65,770,1,58};


        int val=arr[0];  //putting first element into val variable

        for(int i=0; i<arr.length; i++){
            if(arr[i] > val){     //Checking one by one element whether it is greater than Val or not
                val=arr[i];       // if YES, replace val value with that element
            }
        }
        System.out.println("Largest value in the Given Array is "+ val);
    }


}
