package com.oracle.lal.modernjava.npe;

import org.junit.jupiter.api.Test;

public class HelpfulNPETest {
    @Test
    public void demo0() {
        A a = new A();
        a.b.c = new C();
    }

    @Test
    public void demo1() {
        A a = new A();
        a.getB().c = new C();
    }

    @Test
    public void demo2() {
        A a = null;
        a.getB().c = new C();
    }

    @Test
    public void demo3() {
        A a = new A();
        a.b = new B();
        int x = 3;
        D d = a.b.cc[x].d;


    }
}
