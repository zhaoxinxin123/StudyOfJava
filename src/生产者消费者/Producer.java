package 生产者消费者;

public class Producer implements Runnable {
    private PubBox pubBox;
    public Producer(PubBox pubBox){
        this.pubBox=pubBox;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System. out .println("Con: i " +i);
            try {
                Thread.sleep(3000); // 这里设置跟上面30不同是为了 盒子中的苹果能够增加，不会生产一个马上被消费
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pubBox.decreadse();
        }
    }
}
