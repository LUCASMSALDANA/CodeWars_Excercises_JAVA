/* You want to create secret messages which can be deciphered by the Decipher this!
kata. Here are the conditions:


Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter must be converted to its ASCII code.
The second letter must be switched with the last letter
Keepin' it simple: There are no special characters in the input.
 */

public class EncryptThis {
    public static void main(String[] args) {
        String text="A wise old owl lived in an oak";
        String textoAReversar="";
        String reversedText="";
        String encryptedText="";
        Character letra ;
        boolean convertirCharcode=false;
        for(int i=0 ; i<text.length();i++){
            letra=text.charAt(i);
            if(i==0 && Character.isLetter(letra)){convertirCharcode=true;}
            if(Character.isLetter(text.charAt(i))){
                if( convertirCharcode){
                    letra=text.charAt(i);
                    encryptedText+=letra.hashCode();
                    convertirCharcode=false;
                }else{
                    textoAReversar+=letra;
                }
            }else{
                convertirCharcode = true;
                for (int j=textoAReversar.length()-1;j>=0;j--){
                    reversedText+=textoAReversar.charAt(j);
                }
                encryptedText+=reversedText+letra;
                    textoAReversar = "";
                    reversedText = "";
            }
            if (i == text.length() - 1) {
                for (int j=textoAReversar.length()-1;j>=0;j--){
                    reversedText+=textoAReversar.charAt(j);
                }
                encryptedText+=reversedText;
            }
        }
        System.out.println(encryptedText);


    }

}
