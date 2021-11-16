package com.company;
class shape{
    public String draw(){
        return "Drawing shape";
    }
    public String erase(){
        return "Erasing shape ";
    }
}
public class project_8 {
    public static void main(String[] args) {
        shape sp=new shape();
        System.out.println(sp.draw());
        System.out.println(sp.erase());
    }
}
