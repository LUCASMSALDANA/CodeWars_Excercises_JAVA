public class ReversedStrings {
    //Complete the solution so that it reverses the string passed into it.
    public static void main(String[] args) {

        String texto = "Hola Mundo";
        String reversedTexto="";

        for(int i=texto.length()-1; i>=0;i--){
            reversedTexto+=texto.charAt(i);
        }
        System.out.println("Texto original : "+texto);
        System.out.println("Texto dado vuelta : "+reversedTexto);
    }
}
