package p2;

public class Student {
    public String name;
    public int age;
    public String program;
    Student(){

    }

    Student(int a,String n, String p){
        this.name=n;
        this.age=a;
        this.program=p;
    }

    public void display_student_info(){
        System.out.println(name+" "+ age+" "+program);
    }
}
