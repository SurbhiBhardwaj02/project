package p2;
import p2.Student;

public class GraduateStudent extends Student {
    public int percentage ;
    public String stream;
    GraduateStudent(int age,String name,String program, String s,int p){
        super(age, name,program);
        this.percentage=p;
        this.stream=s;
    }

    @Override
    public void display_student_info() {
        System.out.println("Name="+name+" Age="+age+" Program="+program+" Percentage="+percentage+" Stream="+stream);
    }
}
