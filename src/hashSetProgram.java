import java.util.HashSet;
import java.util.Iterator;
public class hashSetProgram {
    public static void main(String[] args) {


        HashSet<Integer> set = new HashSet<>();
        // add element
        set.add(1);
        set.add(2);
        set.add(9);
        set.add(9);

        System.out.println(set);

        // delete element
        set.remove(9);
        System.out.println(set);

        //searching
        if (set.contains(8)) {
            System.out.println("element present in set");
        }

        Iterator it= set.iterator();
        while( it.hasNext()){

        System.out.println(it.next());
    }
    }
}
