//Write a function which calculates the average of the numbers in a given list.
        //Note: Empty arrays should return 0.

public class CalculateAvarage {

    public static void main(String[] args) {
        int[] array = {};
        double sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum/ array.length);
    }

}
