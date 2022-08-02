/*Write a function that takes a string of parentheses, and determines if the order
of the parentheses is valid. The function should return true if the string is valid,
and false if it's invalid.
 */
public class ValidParentheses {
    public static void main(String[] args) {


    String parens="()(())()";
    if(parens.length()%2!=0){System.out.println("false");
    }else{
        boolean abreparentesis = true;
        String letra="";
        for(int i =0; i<parens.length();i++){
            letra= String.valueOf(parens.charAt(i));
            if(letra.equals(")") || letra.equals("(")){
                if(abreparentesis && letra.equals("(")){
                    abreparentesis=false;
                }else if(!abreparentesis &&letra.equals(")")){
                    abreparentesis=true;
                }else{
                    System.out.println("volvete puto");
                }
            }
        }
        System.out.println("todo bien vieja");
    }

    }
}
