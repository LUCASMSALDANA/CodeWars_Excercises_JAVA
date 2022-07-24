import java.util.Locale;
import java.util.Set;

public class Pangrama {
    public static void main(String[] args) {
        String sentence= "asdfglkjhpoiuyqertzxcmnvb";
        sentence = sentence.toLowerCase();
        String[] abc= {"a","b","c","d","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

                    for(int i=1 ; i<=abc.length; i++){
                        if(!sentence.contains(abc[i-1])){
                            System.out.print("NO ");
                            i=abc.length;
                        }
                  }
        System.out.println("Es un pangrama");
    }
}
