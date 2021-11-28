package p2;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student obj1= new Research_Student(sc.nextInt(),sc.next(), sc.next(), sc.next(), sc.nextInt());
        Student obj2=new GraduateStudent(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
        obj1.display_student_info();
        obj2.display_student_info();
    }
}
