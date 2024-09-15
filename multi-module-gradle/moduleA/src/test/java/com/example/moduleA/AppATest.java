package com.example.moduleA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppATest {

    @Test
    public void testGetMessage() {
        System.out.println("This is Test A");
        AppA appA = new AppA();
        assertEquals("Hello from Module A!", appA.getMessage());

    }
}
