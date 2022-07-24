/*Return the number (count) of vowels in the given string.
/*We will consider a, e, i, o, u as vowels for this Kata (but not y).
 */
public class VowelCount {

    public static void main(String[] args) {
        System.out.println("**********************************************");
        System.out.println("********* Resolviendo con un IF y || *********");
        System.out.println("**********************************************");
        System.out.println("");
        String texto = "Esto es una prueba para contar cuantas vocales hay";
        System.out.println(texto);
        int conteo=0;

        for(int i = 0; i<texto.length();i++){
            if(texto.substring(i,i+1).equalsIgnoreCase("a")
                    ||texto.substring(i,i+1).equalsIgnoreCase("e")
                    ||texto.substring(i,i+1).equalsIgnoreCase("i")
                    ||texto.substring(i,i+1).equalsIgnoreCase("o")
                    ||texto.substring(i,i+1).equalsIgnoreCase("u")
            ){
                conteo+=1;
            }
        }
        System.out.println("");
        System.out.println("El texto contiene : "+conteo+" vocales");
        System.out.println("");

        // Usando un contains

        System.out.println("**********************************************");
        System.out.println("********* Resolviendo con un IF y || *********");
        System.out.println("**********************************************");
        System.out.println("");
        System.out.println(texto);

        String vocales ="aeiou";
        texto=texto.toLowerCase();
        conteo=0;

        for(int i = 0; i<texto.length();i++){
            if(vocales.contains(texto.substring(i,i+1))){
                conteo+=1;
            }
        }
        System.out.println(conteo);
    }
}
