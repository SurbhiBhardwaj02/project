import java.util.*;

public class Student {
    String name;
    Student(){
        name ="Unknown";
    }
    Student(String name ){
        this.name=name;
    }

    public static void main(String[] args) {
        Student obj=new Student();
        Student obj1= new Student("Tinu");
        System.out.println(obj.name);
        System.out.println(obj1.name);
    }
}
