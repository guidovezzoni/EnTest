package com.guidovezzoni.entest;


import com.guidovezzoni.entest.enums.TestStatus;
import com.guidovezzoni.entest.interfaces.TestFunction;
import com.guidovezzoni.entest.model.TestData;
import com.guidovezzoni.entest.model.TestSummary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guido on 30/09/17.
 */
public class InAppTest {
    private List<TestData> testList = new ArrayList<>();

    private <EXP> TestStatus testFeature(TestFunction<EXP, Boolean> testFunction, EXP expected) {
        try {
            return testFunction.call(expected) ? TestStatus.SUCCESS : TestStatus.FAILED;
        } catch (Exception e) {
            // TODO save exception or message
            return TestStatus.EXCEPTION;
        }
    }

    public <E> void addTest(TestFunction<E, Boolean> testFunction, E expected) {
        testList.add(TestData.create(testFunction, expected));
    }

    public TestSummary run() {
        int total = 0;
        int notExecuted = 0;
        int success = 0;
        int fail = 0;
        int exception = 0;

        for (TestData testData : testList) {
            testData.setResult(testFeature(testData.getTestFunction(), testData.getExpected()));
        }

        for (TestData testData : testList) {
            total++;
            switch (testData.getResult()) {
                case NOT_RUN:
                    notExecuted++;
                    break;
                case SUCCESS:
                    success++;
                    break;
                case FAILED:
                    fail++;
                    break;
                case EXCEPTION:
                    exception++;
                    break;
            }
        }

        return new TestSummary(total, notExecuted, success, fail, exception);
    }
}
