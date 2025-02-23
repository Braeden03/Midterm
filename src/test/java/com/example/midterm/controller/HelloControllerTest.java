package com.example.midterm.controller;

import com.example.midterm.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testSayHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello, World!", controller.sayHello());
    }
}