package com.io;


import java.io.*;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * 对于字节流的简单操作
 *   这是标准
 *   1. 创建源   2. 选择源  （1、2步可以合并）
 *   3. 操作     4. 释放
 *
 *aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbddd
 * 创建分支
 * */
public class zijie {
    public static void main(String[] args) throws IOException {
        System.out.println("主干");
        System.out.println("github在线更新");





    }


    /**
     * 字节输入流
     * */
    void input(){
        //1、创建源（即找要输入的文件）
        //2、选择源（即实例化相应的子类，将前面创建的源传入）
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("a.txt"));
            //3、操作（这里即指读取操作），可以用分段读取
            //3.1每次读入三个字节
            byte[] a = new byte[3];
            //3.2 进行读取操作
            while (inputStream.read(a) != -1) {
                //这里将读取到的字节数组a转换为字符显示出来
                String str = new String(a, 0, 3);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4、关闭流，当源为null时进行关闭操作
                try {
                    if(inputStream == null){
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }

    }

}
