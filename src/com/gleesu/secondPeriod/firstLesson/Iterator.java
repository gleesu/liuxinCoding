package com.sr.first;

/**
 * 1) 通过Iterator，屏蔽内部数据结构细节（具体存储的对象数据类型）
 * */
public interface Iterator {
    //添加方法体，前置default关键字
    public boolean hasNext();
    public Object next();
}
