package com.foo;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        System.out.println("foo setup...");

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        System.out.println("foo tearDown...");

    }

    @org.junit.jupiter.api.Test
    void foo() {

        System.out.println("foo test...");

    }
}