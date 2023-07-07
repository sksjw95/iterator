package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        // iterator() 메서드를 호출하여 Iterator 객체를 가져옵니다.
        Iterator iterator = list.iterator();

        // hasNext() 메서드를 사용하여 컬렉션 객체를 순회합니다.
        while(iterator.hasNext()){
            // next() 메서드를 사용하여 컬렉션 객체의 현재 요소를 가져옵니다.
            System.out.println(iterator.next());
        }
    }
}