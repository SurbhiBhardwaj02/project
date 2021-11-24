import com.sun.jdi.event.ExceptionEvent;


class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            if(i==6){
                try{
                    MyThread1.sleep(5000);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            System.out.println(i);

        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
    }
}
