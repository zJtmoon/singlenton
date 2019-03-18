package org;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by zjt on 18-7-19.
 */
public class Singleton {         //单例的好处有：对于频繁使用的对象可以省去new操作花费的时间；
    private static Singleton ourInstance = new Singleton();
    public List l= new List();
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }

    public static void main(String[] args) {
        List l = Singleton.getInstance().l;
    }
}
