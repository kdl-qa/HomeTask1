import com.sun.deploy.util.StringUtils;

import java.util.*;

public class ListManipulations {
    public static void main(String[] args){
        System.out.println("Please, fill in a five int numbers thru the Enter button: \n");
        Scanner input = new Scanner(System.in);
        String[] strItems = new String[5];
        for (int i = 0; i < strItems.length; i++) {
            strItems[i] = input.next();
        }
        ArrayList list = new ArrayList(Arrays.asList(strItems));
        TreeSet<String> sortList = new TreeSet<String>(list);
        String outp = StringUtils.join(sortList,", ");
        System.out.println("The list of filled in numbers converted to a String w/o duplication: \n" + outp);


    }
}
