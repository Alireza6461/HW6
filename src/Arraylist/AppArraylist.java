package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AppArraylist {
    public void getArrayList(ArrayList<Integer> numbers){
        //fix length
        int size = numbers.size();
        if (numbers.size() % 2 == 1){
            System.out.println("this number is delete:"+numbers.get(size-1));
            numbers.remove(size - 1);}
        //

        Iterator iterator = numbers.iterator();
        int index = 0;
        System.out.print("{");
        for (int i = 0; i < numbers.size(); i = i + 2) {
            System.out.print("(" + numbers.get(i) + "," + numbers.get(i + 1) + ")");
            if (i<size-2)
                System.out.print(",");
        }
        System.out.print("}");
        System.out.println();

        while (iterator.hasNext()) {

            if (index % 2 == 0) {
                if (numbers.size() > index) {

                    if (numbers.get(index) > numbers.get(index + 1)) {
                        System.out.println(" This pair is delete:" +"\n("+numbers.get(index)+","+numbers.get(index+1)+")");
                        numbers.remove(index);
                        numbers.remove(index);
                        iterator = numbers.iterator();
                        index = 0;
                    }

                }

            }

            index++;
            iterator.next();

        }
        System.out.println("\nFinal Arraylist:");
        System.out.println(numbers);
    }
}
