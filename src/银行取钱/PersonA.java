package 银行取钱;

public class PersonA extends Thread {
    //创建 银行对象
    Bank bank;
    //通过构造器传入银行对象,确保两个人进入的是同一个银行

    public PersonA(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money>=100){
            bank.Counter(100);//每次取走100
        }
        try {
            sleep(100);//取完休息0.1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
