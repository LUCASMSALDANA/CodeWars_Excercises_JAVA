import java.util.Arrays;

/* Greed is a dice game played with five six-sided dice. Your mission, should you choose
to accept it,is to score a throw according to these rules. You will always be given an array
with five six-sided dice values.
 */
public class GreedIsGood {
    public static void main(String[] args) {
        int resultado=0;
        int[] dice={2,2,2,2,1};
        int uno=0,dos=0,tres=0,cuatro=0,cinco=0,seis=0;
        for(int i=0; i<dice.length;i++){
            switch (dice[i]) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
            }
        }
    if(uno<3){
        resultado+= uno*100;
    }else{
        resultado+=1000;
        resultado+=(uno%3)*100;
    }
        if(cinco<3){
            resultado+= cinco*50;
        }else{
            resultado+=500;
            resultado+=(cinco%3)*50;
        }
        if(dos>=3){
            resultado+=200;
        }
        if(tres>=3){
            resultado+=300;
        }
        if(cuatro>=3){
            resultado+=400;
        }
        if(seis>=3){
            resultado+=600;
        }
        System.out.println(resultado);
    }
}
