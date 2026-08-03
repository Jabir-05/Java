
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        

        // list.add(67);
        // list.add(78);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);
        // list.add(666);


        // System.out.println(list.contains(666));
        // list.set(0,99);
        // list.remove(3);

        // System.out.println(list)
        int [] arr = new int[5];
        int n = arr.length;


        for(int i= 0; i<n; i++){
            list.add(sb.nextInt());
        }
        for(int i =0; i< n; i++){
            System.out.println(list.get(i));
        }

    }
}
