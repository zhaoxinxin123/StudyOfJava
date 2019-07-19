package 线程同步_三个窗口售票;

public class Main {
    /**
     * java多线程同步锁的使用
     * 三个窗口同时出售20张票
     */
    public static void main(String[] args) {
        Station station1=new Station("窗口1");
        Station station2=new Station("窗口2");
        Station station3=new Station("窗口3");
        station1.start();
        station2.start();
        station3.start();
    }
}
