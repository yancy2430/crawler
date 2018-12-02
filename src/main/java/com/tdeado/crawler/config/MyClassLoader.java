package com.tdeado.crawler.config;

import java.io.IOException;
import java.io.InputStream;
/**
 * 自定义类加载器，并override findClass方法
 */
public class MyClassLoader extends ClassLoader{
     @Override
     public Class<?> findClass(String name) throws ClassNotFoundException{
            try{
                String fileName = name.substring(name.lastIndexOf("." )+1) + ".class" ;
                System.err.println(fileName);
                InputStream is = this.getClass().getResourceAsStream(fileName);
                byte[] b = new byte[is.available()];
                is.read(b);
                 return defineClass(name, b, 0, b. length);
           } catch(IOException e){
                 throw new ClassNotFoundException(name);
           }
     }
}