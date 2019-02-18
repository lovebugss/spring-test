package com.itrjp.test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class B {
    @Autowired
    public A a;

    public A getA() {
        return a;
    }
}
