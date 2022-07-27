import java.util.Arrays;
// Given a random non-negative number, you have
// to return the digits of this number within an array in reverse order.
public class ReversedNumberToArray {
    public static void main(String[] args) {
        long n =3715;
        String nString = String.valueOf(n);
        int[] reversedArray=new int[nString.length()];
        int pos=0;
        for(int i = nString.length()-1;i>=0;i--){
            reversedArray[pos]= Integer.parseInt(Character.toString(nString.charAt(i)));
            pos++;
        }
        System.out.println("Numero original: "+n);
        System.out.println("");
        System.out.print("Numero al reves en un array : [");
        for(int i=0;i< reversedArray.length;i++){
            if(i!= reversedArray.length-1) {
                System.out.print(reversedArray[i] + " , ");
            }else{
                System.out.println(reversedArray[i] +" ]");
            }
        }

        // ****** con String Builder *********

        int[] reversedDigits = Arrays.stream(new StringBuilder().append(n).reverse().toString().split("(?<=.)")).mapToInt(Integer::parseInt).toArray();
        System.out.println("");
        System.out.print("Numero al reves en un array creado con StringBuilder : [");
        for(int i=0;i< reversedDigits.length;i++){
            if(i!= reversedDigits.length-1) {
                System.out.print(reversedDigits[i] + " , ");
            }else{
                System.out.println(reversedDigits[i] +" ]");
            }
        }
    }
}
