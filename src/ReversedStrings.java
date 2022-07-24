public class ReversedStrings {
    //Complete the solution so that it reverses the string passed into it.
    public static void main(String[] args) {

        String texto = "Hola Mundo";
        String reversedTexto="";
        System.out.println("**********************************");
        System.out.println("********Resolucion con For********");
        System.out.println("**********************************");
        System.out.println("");

        for(int i=texto.length()-1; i>=0;i--){
            reversedTexto+=texto.charAt(i);
        }
        System.out.println("Texto original : "+texto);
        System.out.println("Texto dado vuelta : "+reversedTexto);
        System.out.println("");
        // Resolucion con StringBuilder

        System.out.println("**********************************");
        System.out.println("***Resolucion con StringBuilder***");
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("Texto original : "+texto);
        System.out.println("Texto dado vuelta : "+new StringBuilder(texto).reverse());
    }
}
