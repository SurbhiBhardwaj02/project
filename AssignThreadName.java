class Multhr implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class AssignThreadName  {
    public static void main(String[] args) {
        Thread t1=new Thread( new Multhr());
        Thread t2= new Thread(new Multhr());
        t1.setName("Shaggy");
        t2.setName("Scooby");
        t1.start();
        t2.start();
    }

}
