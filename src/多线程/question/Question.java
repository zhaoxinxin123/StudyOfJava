package 多线程.question;

public class Question extends Thread{
    static int tick= 20;
    public Question(String name){
        super(name);
    }

    @Override
    public void run() {
        while (tick>0){
            System.out.println(getName()+"卖出了第"+tick+"张");
            tick--;
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
