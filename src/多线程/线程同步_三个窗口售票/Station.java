package 多线程.线程同步_三个窗口售票;

public class Station extends Thread {
    static  int tick=20;
    //通过构造方法给线程的名称赋值
    public Station(String name){
        super(name);
    }
    //创建一个静态钥匙
    static Object o="aa";   //值是任意的
    //重写run方法
    @Override
    public void run() {
        while (tick>0){
            synchronized (o){
               if (tick>0){
                   //这个很重要必须使用一个锁,进去的人会把钥匙拿在手上,出来才把钥匙让出来
                   System.out.println(getName()+"卖出了第"+tick+"张");
                   tick--;
               }else {
                   System.out.println("卖完了");
               }
            }
            try {
                sleep(1000);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
