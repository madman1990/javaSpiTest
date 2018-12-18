package com.madman.inter.impl;

import com.madman.inter.Person;

/**
 * <pre>
 * 【类型】: Student <br/>
 * 【作用】: 请填写此类的作用<br/>
 * 【时间】：2018/12/18 13:56 <br/>
 * 【作者】：madman <br/>
 * </pre>
 */
public class Student implements Person {
    @Override
    public String eat(String message) {
        return "Student is eating " + message;
    }
}
