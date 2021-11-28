package p2;
import p2.Student;
public class Research_Student extends Student {
    public String specialiazation;
    public int years_of_experiance;
    Research_Student(int age,String name,String program,String sp,int y){
        super(age,name,program);
        this.specialiazation=sp;
        this.years_of_experiance=y;
    }

    @Override
    public void display_student_info() {
        System.out.println("Name="+name+" Age= "+age+" Program="+program+" Specialization="+specialiazation+" Years of experiance="+years_of_experiance);
    }
}
