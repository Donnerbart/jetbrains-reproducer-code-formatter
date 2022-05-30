package org.example;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FormatterTest {

    public static void main(final @Nullable String @NotNull [] args) {
        test("Hello", "World", "!");
    }

    public static void test(final @NotNull String argument1, final @NotNull String argument2, final @NotNull String argument3) {
        System.out.println("argument1: " + argument1);
        System.out.println("argument2: " + argument2);
        System.out.println("argument3: " + argument3);
    }
}
