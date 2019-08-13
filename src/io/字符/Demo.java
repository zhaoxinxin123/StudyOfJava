package io.字符;

import java.io.*;

/**
 * @Descriptipn TODO
 * @Author zxx
 * @Date 2019/8/12 15:27
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\IdeaWork\\StudyOfJava\\src\\io\\字符\\总结.md");
        Reader reader=new FileReader(file);
        Writer writer=new FileWriter("E:\\IdeaWork\\StudyOfJava\\src\\io\\字符\\总结2.md");
        char[] c=new char[1024];
        int len;
//        BufferedWriter bufferedWriter=new BufferedWriter(writer);
//        BufferedReader bufferedReader=new BufferedReader(reader);
//        bufferedReader.readLine();
        while((len=reader.read(c))!=-1) {
            writer.write(c,0,len);
            writer.flush();
        }
        writer.close();
        reader.close();
    }
}
