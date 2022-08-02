public class SquareEveryDigit {
    public static void main(String[] args) {
        Integer n = 9119;
        String nText=String.valueOf(n);
        String textoAconvertir="";
        for(int i=0; i<nText.length();i++){
            int numero = (int) Math.pow(Integer.parseInt(nText.substring(i,i+1)),2);
            textoAconvertir+=String.valueOf(numero);
        }
        System.out.println(Integer.parseInt(textoAconvertir));

    }
}
