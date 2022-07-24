import java.util.Arrays;

public class FindUniqArraysSort {
    public static void main(String[] args) {
        double[] numeros = {4, 4, 4, 4, 2, 4};
        int largo = numeros.length;
        Arrays.sort(numeros); //Arrays.sort (NOMBREdeARRAY) -> ordena de mayor a menor una matriz

        if (numeros[0] != numeros[1]) {   //Una vez ordenada la matriz pregunto si el primer numero es distinto al segundo
            System.out.println(numeros[0]); //Si es asi muestro la posicion 0
        } else {
            System.out.println(numeros[largo - 1]); // Si el primero no es diferente al segundo entonces seguro el ultimo lo es
        }

    }
}