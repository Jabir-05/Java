import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner  sb = new Scanner(System.in);
        for(int i =0; i<arr.length;i++){
            arr[i] = sb.nextInt();
        }
        for(int i= 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
