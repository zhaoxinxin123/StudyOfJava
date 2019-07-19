package 多线程.生产者消费者;

public class PubBox {
    private int   apple=0;
    public synchronized void increace(){
        while (apple==5){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        apple++;
        System.out.println("生产苹果成功!");
        notify();
    }
    public synchronized void decreadse(){
        while (apple ==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        apple--;
        System. out.println( "消费苹果成功！" );
        notify();
    }

    public static void main(String[] args) {
        PubBox box= new PubBox();

        Consumer con= new Consumer(box);
        Producer pro= new Producer(box);

        Thread t1= new Thread(con);
        Thread t2= new Thread(pro);

        t1.start();
        t2.start();
    }
}
