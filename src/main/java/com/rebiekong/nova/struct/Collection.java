package com.rebiekong.nova.struct;

/**
 * @author RebieKong
 */
public interface Collection<T> extends Iterable<T> {
    int size();

    T get();

    void set(T item);

    void remove(T item);
}
