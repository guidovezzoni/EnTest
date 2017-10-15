package com.guidovezzoni.entest.model;

/**
 * Created by guido on 01/10/17.
 */

public class TestSummary {
    private int total;
    private final int notExecuted;
    private final int success;
    private final int fail;
    private final int exception;

    public TestSummary(int total, int notExecuted, int success, int fail, int exception) {
        this.total = total;
        this.notExecuted = notExecuted;
        this.success = success;
        this.fail = fail;
        this.exception = exception;
    }

    public int getNotExecuted() {
        return notExecuted;
    }

    public int getSuccess() {
        return success;
    }

    public int getFail() {
        return fail;
    }

    public int getException() {
        return exception;
    }

    public int getTotal() {
        return total;
    }
}
