package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testRemoveSuccessiveDuplicates() {

        Assertions.assertEquals("Pocsine", Main.removeDuplicates("Procrastinate"));

    }

}