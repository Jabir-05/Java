public class LeanerSearch {

    public static int leaner(int [] a , int key){
        for(int i =0; i<a.length;i++){
            if (a[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = {50,10,33,40,26};
        int key = 99;
        System.out.println(leaner(a,key));


    }
}
