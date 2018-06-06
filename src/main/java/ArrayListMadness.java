import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMadness {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Please, fill in a five string lines divided by Enter: \n");
        int lines = 5;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < lines; i++) {
            list.add(input.next());
        }
        System.out.println("You are set strings: " + list);
        int arrayMinIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() <= list.get(arrayMinIndex).length()){
                arrayMinIndex = i;
            }
        }

        System.out.println("Minimal string line: ");
        for (String repetition : list) {
            if (repetition.length() == list.get(arrayMinIndex).length()) {
                System.out.print(repetition + ", ");
            }
        }
        //todo: need advices how to change loop to display strings with minimal
    }


}
