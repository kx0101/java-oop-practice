package com.example.util;

import com.example.util.FooRuntimeException;

public class MyFileUtils {
    public int subtract10FromLargerNumber(int number) throws FooRuntimeException {
        if (number < 10) {
            throw new FooRuntimeException("the number passed was smaller than 10");
        }

        return number - 10;
    }

}
