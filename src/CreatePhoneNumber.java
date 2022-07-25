/*Write a function that accepts an array of 10 integers (between 0 and 9), that returns
a string of those numbers in the form of a phone number.
 */
public class CreatePhoneNumber {
    public static void main(String[] args) {
        String phoneNumber="";
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for(int i=0; i<numbers.length;i++){
            if (i==0){
                phoneNumber+="(";
            }else if(i==3){
                phoneNumber+=") ";
            }else if(i==6){
                phoneNumber+="-";
            }
            phoneNumber+=numbers[i];
        }
        System.out.println(phoneNumber);
    }
}
