import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDi {
    public static void main(String[] args) {
        Scanner sb= new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i =0; i<3; i++){
            System.out.println(new ArrayList<>());
        }

        for(int i =0; i<3;i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sb.nextInt());

            }

            
           
        }
    }
}
