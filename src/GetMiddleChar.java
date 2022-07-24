import java.util.Scanner;

public class GetMiddleChar {
    public static void main(String[] args) {
        boolean par;
        String word;
        int pos;
        String medio;
        word= "cas";

            par = (word.length() % 2 == 0) ? true : false;


                if (par) {
                    pos = (word.length() / 2) ;
                    System.out.println(pos);
                    System.out.println("Las letras que corresponden al medio de su palabra son :" + word.substring(pos-1,pos+1));
                } else {
                    if (word.length() != 1) {
                        pos = (word.length() / 2);
                        System.out.println("La letra que corresponde al medio de su palabra es : " + word.charAt(pos));
                    } else {
                        System.out.println("Su palabra contiene una sola letra mugrosa, aqui la tiene: " + word);
                    }

                }
    }
}

