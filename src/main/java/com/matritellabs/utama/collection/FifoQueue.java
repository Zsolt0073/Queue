package com.matritellabs.utama.collection;

import java.util.LinkedList;

public class FifoQueue implements Queue {

    public static LinkedList<Object> ourList = new LinkedList();

    @Override
    public boolean add(Object e) {
        ourList.add(e);
        if (ourList.contains(e)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object element() {
        Object o;
        o = ourList.get(0);
        return o;
    }

    @Override
    public boolean offer(Object e) {
        return false;
    }

    @Override
    public Object peek() {
        Object o = new Object();
        if (ourList.isEmpty()) {
            return null;
        } else {
            return ourList.contains(o);
        }
    }

    @Override
    public Object poll() {
        Object o = new Object();
        if (ourList.isEmpty()) {
            return null;
        } else {
            return ourList.(o);
        }
    }

    @Override
    public Object remove() {
        return null;
    }
}
