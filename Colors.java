import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class test1 implements Runnable{
    @Override
    public void run() {
        String color[]={"white","blue","black","green","red","yellow"};
        Random r =new Random();
        int index;
        while ((index = r.nextInt(6))!=4){
            System.out.println(color[index]);
        }

    }
}

public class Colors {
    public static void main(String[] args) {

        Thread t=new Thread(new test1());
        t.start();
    }

}
