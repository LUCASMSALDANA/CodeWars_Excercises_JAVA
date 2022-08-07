import java.util.ArrayList;
import java.util.List;

public class SquareEveryDigit {
    public static void main(String[] args) {
        Integer n = 9119;
        String nText=String.valueOf(n);
        String textoAconvertir="";
        for(int i=0; i<nText.length();i++){
            int numero = (int) Math.pow(Integer.parseInt(nText.substring(i,i+1)),2);
            textoAconvertir+=String.valueOf(numero);
        }
       // System.out.println(Integer.parseInt(textoAconvertir));
        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int numero=prueba(numeros);


    }

    private static int prueba(int[] numeros) {
        for (int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
            return numeros[i];
        }
        return 0;
    }
}
