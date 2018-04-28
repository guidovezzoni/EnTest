package com.guidovezzoni.entest.model;


import com.guidovezzoni.entest.enums.TestStatus;
import com.guidovezzoni.entest.interfaces.TestFunction;

/**
 * Created by guido on 30/09/17.
 */
public class TestData<E> {
    private final TestFunction<E, Boolean> testFunction;
    private final E expected;
    private TestStatus result = TestStatus.NOT_RUN;

    public static <T> TestData<T> create(TestFunction<T, Boolean> testFunction, T expected) {
        return new TestData<>(testFunction, expected);
    }

    private TestData(TestFunction<E, Boolean> testFunction, E expected) {
        this.testFunction = testFunction;
        this.expected = expected;
    }

    public TestFunction<E, Boolean> getTestFunction() {
        return testFunction;
    }

    public E getExpected() {
        return expected;
    }

    public TestStatus getResult() {
        return result;
    }

    public void setResult(TestStatus result) {
        this.result = result;
    }
}
