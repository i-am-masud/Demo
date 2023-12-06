import java.util.ArrayList;
import java.util.Collections;

class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elemets

        list.add(11);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get elements

        int element = list.get(0); // 'get' will give the value of the mentioned index
        System.out.println(element);

        // add elements in between

        list.add(1, 4); // list.add ( index , element )
        System.out.println(list);

        // set element or change element

        list.set(0, 0);
        System.out.println(list);

        // delete or remove element

        list.remove(1);
        System.out.println(list);

        // size

        int size = list.size();
        System.out.println(size);

        // loop

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

    }
}
