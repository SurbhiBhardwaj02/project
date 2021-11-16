package com.company;
import java.util.Scanner;
class Books{
    private   String  name;
    private   String author;
    private  double price;
    private   int qtyInStoke;
    Books(String n, String a, double p, int q){
        name=n;
        author=a;
        price=p;
        qtyInStoke=q;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQtyInStoke() {
        return qtyInStoke;
    }
}
public class project_5 {
    public static void main(String[] args) {
        String nam, aut;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book");
        nam=sc.nextLine();
        System.out.println("Enter the name of author of book");
        aut=sc.nextLine();
        System.out.println("Enter the quantity of book");
        int qut=sc.nextInt();
        System.out.println("Enter the price of book");
        double pr=sc.nextDouble();
        Books bk=new Books(nam, aut, pr, qut);
        System.out.println("Name of book is "+bk.getName());
        System.out.println("Name of author is "+bk.getAuthor());
        System.out.println("Price of the book "+bk.getPrice());
        System.out.println("Quantity of the book "+bk.getQtyInStoke());
    }
}
