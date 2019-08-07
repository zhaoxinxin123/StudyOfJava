package 生成指定字节字符串;

import sun.misc.BASE64Encoder;

import java.util.Random;

public class Base64 {
    public static void main(String[] args) {
        byte[] bytes=getRandomByteArray(32);
        BASE64Encoder encoder=new BASE64Encoder();
        System.out.println(bytes);
        System.out.println(encoder.encode(bytes));
    }
    public static byte[] getRandomByteArray(int len){
        if (len<0||len>256){
            throw new IllegalArgumentException("不合法长度"+len);

        }
        byte[] bytes=new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i]=(byte)i;
        }
        Random random=new Random();
        byte[] randBytes=new byte[len];
        int size=256;
        while (--len>=0){
            int index=random.nextInt(size);
            randBytes[len]=bytes[index];
//            bytes[index]=bytes[--size];
        }
        return randBytes;
    }
}
