import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String org, rev="";
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no. to check");
        org= sc.nextLine();
        int length=org.length();
        for(int i=length-1;i>=0;i--)
            rev+=org.charAt(i);
        if(org.equals(rev))
            System.out.println("no. is palindrome");
        else
            System.out.println("no. is not palindrome");
    }
}
