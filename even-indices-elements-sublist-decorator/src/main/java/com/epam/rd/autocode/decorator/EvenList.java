package com.epam.rd.autocode.decorator;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public interface EvenList<T> extends List<T> {
    @Override
    int size();
    @Override
    T get(int index);
    @Override
    Iterator<T> iterator();
}
