package org.n3r.quartz.glass.util;

/**
 * @author damien bourdette
 */
public class Arrays {
    public static <T> T[] copyOf(T[] original) {
        return original == null ? null : java.util.Arrays.copyOf(original, original.length);
    }
}
