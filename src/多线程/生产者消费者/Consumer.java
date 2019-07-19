package 多线程.生产者消费者;

public class Consumer  implements Runnable{
    private PubBox pubBox;
    public Consumer(PubBox pubBox){
        this.pubBox=pubBox;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System. out .println("pro  i:" +i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pubBox.increace();
        }
    }
}
