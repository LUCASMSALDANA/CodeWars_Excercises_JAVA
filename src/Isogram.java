/* OBJETIVO DEL PROGRAMA
 *  Este programa recibe una cadena de texto, y verifica que sea un Isograma, es decir que en la palabra
 *  no hayan letras repetidas
 */

public class Isogram {

    public static void main(String[] args) {
        String str = "hila";
        char compara1;
        char compara2;
        str = str.trim().toUpperCase();
        int largo = str.length();
        boolean iso = true;

        for (int i = 1; i <= largo; i++) {
            compara1 = str.charAt(i - 1);
            System.out.println("");
            for (int j = 1; j <= largo; j++) {
                if (i != j && j > i) {
                    compara2 = str.charAt(j - 1);
                    System.out.println("primer letra: " + compara1 + "   segundo letra: " + compara2);
                    if (compara1 == compara2) {
                        iso = false;
                        i = 10;
                    }
                }
            }
        }
        if (iso) {
            System.out.println("La palabra no contiene letras repetidas, es un Isograma");
        } else {
            System.out.println("La palabra contiene letras repetidas, No es Isograma ");
        }
    }
}