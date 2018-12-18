package com.madman.test;

import com.madman.inter.Person;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * <pre>
 * 【类型】: PersonTest <br/>
 * 【作用】: 请填写此类的作用<br/>
 * 【时间】：2018/12/18 13:58 <br/>
 * 【作者】：madman <br/>
 * </pre>
 */
public class PersonTest {
    /**
     * 测试spi
     *
     * @param args
     */
    public static void main(String[] args) {
        ServiceLoader<Person> serviceLoader = ServiceLoader.load(Person.class);
        Iterator<Person> searchs = serviceLoader.iterator();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        while (searchs.hasNext()) {
            System.out.println(searchs.next().eat("吃饭啦"));
        }

    }
}
