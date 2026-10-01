public class Demo {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        s1.age = 28;
        s1.name = "abhishek";
        s1.college ="Amity";
        s1.roll_number = 122333;

        s2.age =23;
        s2.name = "jabir";
        s2.college = "Amity";
        s2.roll_number =2233;

        s1.markAttentdance();
        s2.markAttentdance();

        s1.print();
        s2.print();
        
    }
}


class student {
    int age;
    String name;
    String college;
    int roll_number;

    void  markAttentdance(){
        System.out.println("Attentdance is marked by "+ name);
    }
    
    void  print(){
        System.out.println(name + " " + age + " " + roll_number + " "+college);
    }
}