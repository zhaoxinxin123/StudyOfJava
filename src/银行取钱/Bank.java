package 银行取钱;

public class Bank {
    static int money=1000;
    //柜台取钱的方法
    public void Counter(int money){//参数是每次取走的钱
        Bank.money-=money;//取钱后总数减少
        System.out.println("A取走了"+money+"还剩下"+Bank.money);

    }
    //ATM 取钱的方法
    public void  ATM(int money){
        Bank.money-=money;//取钱后总数减少
        System.out.println("B取走了"+money+"还剩下"+Bank.money);

    }
}
