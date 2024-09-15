package com.example.moduleB;

import com.example.moduleA.AppA;

public class AppB {
    public static void main(String[] args) {
        AppA appA = new AppA();
        System.out.println(appA.getMessage() + " And hello from Module B!");
    }
}
