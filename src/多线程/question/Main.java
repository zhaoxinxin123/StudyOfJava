package 多线程.question;

public class Main {
    public static void main(String[] args) {
        Question question1=new Question("one");
        Question question2=new Question("two");
        Question question3=new Question("three");
        question1.start();
        question2.start();
        question3.start();
        new Question("four").start();
        new Question("five").start();
        /**
                * one卖出了第20张
                * two卖出了第20张
                * one卖出了第19张
                * two卖出了第18张
                * one卖出了第17张
                * two卖出了第16张
                * one卖出了第15张
                * two卖出了第14张
                * one卖出了第13张
                * two卖出了第12张
                * one卖出了第11张
                * two卖出了第10张
                * three卖出了第9张
                * one卖出了第9张
                * four卖出了第7张
                * three卖出了第7张
                * three卖出了第4张
                * three卖出了第3张
                * three卖出了第2张
                * three卖出了第1张
                * two卖出了第8张
                * four卖出了第5张
                * one卖出了第6张
         */
    }
}
