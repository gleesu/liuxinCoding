package com.sr.first;


/**
 * 1) 接口中的方法 没有 方法体
 *
 * */

public interface List {
    public void add(Object o);

    public void add(int index, Object o);

    public Object get(int index);

    public Object remove(int index);

    public int size();
}
