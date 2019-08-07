package Java技术大本营.类_实例_值传递变化;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        test.start();
    }
    void start(){
        Value value1=new Value();
        System.out.println(value1.b+"");
        Value value2=change(value1);
        System.out.println(value1.b+"    "+value2.b);

    }
    Value change(Value value){
        value.b=1;
        return value;
    }
}
