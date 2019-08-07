package Java技术大本营.类的加载;

public class Father {
    private String name="father";
    public Father(){
        printName();
    }

    private void printName() {
        System.out.println(name);
    }
    static class Son extends Father{
        private String name="son";
        public void printName(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Father  father=new Son();
    }
}
