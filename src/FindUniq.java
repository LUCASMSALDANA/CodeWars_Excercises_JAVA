
public class FindUniq {
    public static void main(String[] args) {
        double[] numeros = {4,4,4,4,2,4};
        int largo = numeros.length;
        double compara1, compara2;
        double numerodistinto=1;
        boolean hay = false;
        int pos=0;
        System.out.println(numeros[2]);
        for (int i = 1; i <= largo; i++) {
            if (numeros[0] != numeros[i - 1]) {
                pos = i - 1;
                i=largo+1;
                numerodistinto=numeros[pos];
                hay = true;
            }
        }
        if (hay == true) {
            System.out.println("El numero distinto es: " +numerodistinto);
        }else{
            System.out.println("no hay numeros distintos");
        }
        System.out.println(largo);
    }

}
