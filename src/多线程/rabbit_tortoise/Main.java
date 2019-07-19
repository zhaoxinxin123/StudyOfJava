package 多线程.rabbit_tortoise;

public class Main {
    public static void main(String[] args) {
        Tortoise tortoise=new Tortoise();
        Rabbit rabbit=new Rabbit();
        //回调方法的使用,谁先调用calltoback方法,另一个就停
        LetOneStop letOneStop1=new LetOneStop(tortoise);
        rabbit.calltoback=letOneStop1;  //让兔子回调方法里存乌龟对象的值
        LetOneStop letOneStop2=new LetOneStop(rabbit);
        tortoise.calltoback=letOneStop2;//让乌龟子回调方法里存乌兔子龟对象的值
        //开始跑
        tortoise.start();
        rabbit.start();
    }
}
