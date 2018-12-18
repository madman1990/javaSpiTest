package com.madman.inter.impl;

import com.madman.inter.Person;

/**
 * <pre>
 * 【类型】: Teacher <br/>
 * 【作用】: 请填写此类的作用<br/>
 * 【时间】：2018/12/18 13:57 <br/>
 * 【作者】：madman <br/>
 * </pre>
 */
public class Teacher implements Person {
    @Override
    public String eat(String message) {
        return "Teacher is eating " + message;
    }
}
