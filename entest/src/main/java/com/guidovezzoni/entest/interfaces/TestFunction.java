package com.guidovezzoni.entest.interfaces;

/**
 * Created by guido on 30/09/17.
 */
@FunctionalInterface
public interface TestFunction<T1, R> {
    R call(T1 t1) throws Exception;
}
