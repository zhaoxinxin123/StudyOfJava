package io.字节;

import java.io.*;

/**
 * @Descriptipn TODO
 * @Author zxx
 * @Date 2019/8/12 15:08
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\IdeaWork\\StudyOfJava\\src\\io\\字节\\总结.md");
        InputStream inputStream=new FileInputStream(file);
        OutputStream outputStream=new FileOutputStream("E:\\IdeaWork\\StudyOfJava\\src\\io\\字节\\总结2.md");

        byte[] b=new byte[1024];
//        inputStream.read(b);
//        int =inputStream.read(b);
        int len;
        while((len=inputStream.read(b))!=-1){
            outputStream.write(b,0,len);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
    }
}
