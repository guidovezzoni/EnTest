package com.guidovezzoni.entest.model;


import com.guidovezzoni.entest.enums.TestStatus;
import com.guidovezzoni.entest.interfaces.TestFunction;

/**
 * Created by guido on 30/09/17.
 */
public class TestData<EXP> {
    private final TestFunction<EXP, Boolean> testFunction;
    private final EXP expected;
    private TestStatus result = TestStatus.NOT_RUN;

    public static <E> TestData<E> create(TestFunction<E, Boolean> testFunction, E expected) {
        return new TestData<>(testFunction, expected);
    }

    private TestData(TestFunction<EXP, Boolean> testFunction, EXP expected) {
        this.testFunction = testFunction;
        this.expected = expected;
    }

    public TestFunction<EXP, Boolean> getTestFunction() {
        return testFunction;
    }

    public EXP getExpected() {
        return expected;
    }

    public TestStatus getResult() {
        return result;
    }

    public void setResult(TestStatus result) {
        this.result = result;
    }
}
