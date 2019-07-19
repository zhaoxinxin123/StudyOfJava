package 多线程.rabbit_tortoise;

public class Tortoise extends Animal {
    @Override
    public void runing() {
        //跑的距离
        double dis=0.1;
        length-=dis;
        if (length<=0){
            length=0;
            System.out.println("乌龟胜利了");
            //让兔子不要跑了
            if (calltoback!=null){
                calltoback.win();
            }
        }
        System.out.println("乌龟跑了"+dis+"米,距离终点还有"+(int)length);
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
