import java.util.Scanner;

public class Triangle {

    //Crear un programa que reciba 3 parametros y nos devuelva si es posible o no, formar un triangulo.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el primer numero : ");
        int a = in.nextInt();
        System.out.print("Ingrese el segundo numero : ");
        int b = in.nextInt();
        System.out.print("Ingrese el tercer numero : ");
        int c = in.nextInt();




        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Con esto no haces nada pibe");
        }else {
            if (a + b > c || a + c > b || b + c > a) {  //Utilizo el teorema de la desigualdad del triangulo
                // Basicamente la suma de los 2 lados tienen q ser siempre mayor al que sobra
                // si las 3 combinaciones cumplen esta condicion, entonces es un triangulo perrito.
                System.out.println("Con esto si podes hacer un triangulo macho alfa");
            } else {
                System.out.println("Con esto no podes hacer nada pichon de codorniz");
            }
        }
    }
}
