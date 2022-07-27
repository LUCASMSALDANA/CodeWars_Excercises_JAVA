
/*Timmy & Sarah think they are in love, but around where they live, they will only know once
they pick a flower each. If one of the flowers has an even number of petals and the other has
an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are
in love and false if they aren't.

 */
public class OppositeAttracts {
    public static void main(String[] args) {


        final int flower1=42;
        final int flower2=43;
        double num1=flower1%2;
        double num2=flower2%2;
        if(num1!=num2){
             System.out.println("Se enamoran!");
        }else{
            System.out.println("El amor duele a veces, no se enamoran :(");
         }
    }
}
