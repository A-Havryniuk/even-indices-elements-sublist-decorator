package com.epam.rd.autocode.decorator;

import java.util.*;

public class ListDecorator<T> implements EvenList<T>{
    private List<T> array;

    public ListDecorator(List<T> array) {
        this.array = array;
    }

    @Override
    public int size() {
        return (array.size()+1)/2;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T get(int index) {
        return array.get(index*2);
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator() {
         List<T> myList = new ArrayList<>();
         for(int i = 0; i < array.size(); i += 2)
             myList.add(array.get(i));
         return myList.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        List<T> myList = new ArrayList<>();
        for(int i = 0; i < array.size(); i += 2)
            myList.add(array.get(i));
        return myList.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        List<T> myList = new ArrayList<>();
        for(int i = 0; i < array.size(); i += 2)
            myList.add(array.get(i));
        return myList.iterator();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(T t) {
        return false;
    }


    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }


    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}
