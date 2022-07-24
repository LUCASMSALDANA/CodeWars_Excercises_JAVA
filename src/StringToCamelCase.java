public class StringToCamelCase {

    /*Complete the method/function so that it converts dash/underscore delimited words into
    camel casing. The first word within the output should be capitalized only if the original
    word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
     */

    public static void main(String[] args) {

        boolean convertirMayuscula =false;
        String texto = "the stealth warrior";
        String textoCamelCase ="";

        for(int i=0; i<texto.length();i++) {
            if (Character.isLetter(texto.charAt(i))) {
                if(convertirMayuscula==true) {
                    textoCamelCase+=String.valueOf(texto.charAt(i)).toUpperCase();
                    convertirMayuscula = false;
                }else{
                    textoCamelCase+=String.valueOf(texto.charAt(i));
                }
            }else{
                convertirMayuscula=true;
            }
        }
        System.out.println(textoCamelCase);
    }
}
