package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("dsvf");
        list.add("sdvvvv");
        list.add("sdvzzzzz");
        Iterator<String> iterator = list.iterator();


       /* while(iterator.hasNext()){

            String str = iterator.next();
            System.out.println(str);
        }*/

        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("sdvvvv")){
                iterator.remove();
            }

        }
        System.out.println(list);
    }
}
