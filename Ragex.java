import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ragex {
    public static void main(String[] args) {
        String target1="baabberererbbbrtrt";
        String target= "9&9 8q8 7*&ab";
        //Pattern ph=Pattern.compile("(a|A)+[a-z]{}");
        Pattern ph=Pattern.compile("[b]?");
        Pattern p=Pattern.compile("\\W");
        int ctr=0;
        Matcher m= p.matcher(target);
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+"  "+m.end()+"  "+m.group());
        }
        int ctr1=0;
        Matcher m1= ph.matcher(target1);
        while(m1.find())
        {
            ctr1++;
            System.out.println(m1.start()+"  "+m1.end()+"  "+m1.group());
        }
        System.out.println(ctr);
        System.out.println(ctr1);

    }




}
