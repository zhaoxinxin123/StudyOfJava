package 银行取钱;

/**
 * 两个人AB通过同一个账户 A在柜台  B在ATM机取钱
 */
public class Main {
    public static void main(String[] args) {
        //实例化一个银行对象
        Bank bank=new Bank();

        PersonA personA=new PersonA(bank);
        PersonB personB=new PersonB(bank);
        //两个人开始取钱
        personA.start();
        personB.start();
    }
}
