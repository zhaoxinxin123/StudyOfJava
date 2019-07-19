package rabbit_tortoise;

public class LetOneStop implements Animal.Calltoback {
    //动物对象
    Animal animal;

    public LetOneStop(Animal animal) {
        this.animal = animal;
    }
    //让动物线程停止
    @Override
    public void win() {
        animal.stop();
    }
}
