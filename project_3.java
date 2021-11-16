package com.company;
import java.util.Scanner;
class test{
    private String Name;
    private double percentage;
    test(String name, double Percentage){
        Name=name;
        percentage=Percentage;
    }
    public void print(){
        System.out.println("Name of student is "+Name+" and the percentage is "+percentage);
    }
}
public class project_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student ");
        String nam=sc.nextLine();
        System.out.println("Enter the percentage of student ");
        double per=sc.nextDouble();
        test ts=new test(nam, per);
        ts.print();

    }}
