package com.igeeksky.xtool.core.lang;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Patrick.Lau
 * @since 1.0.1 2021-11-19
 */
public class ArrayUtilsTest {

    @Test
    public void isEmpty() {
        Assert.assertTrue(ArrayUtils.isEmpty(nullBytes()));
        Assert.assertTrue(ArrayUtils.isEmpty(emptyBytes()));
        Assert.assertFalse(ArrayUtils.isEmpty(singletonBytes()));
    }

    @Test
    public void isNotEmpty() {
        Assert.assertFalse(ArrayUtils.isNotEmpty(nullBytes()));
        Assert.assertFalse(ArrayUtils.isNotEmpty(emptyBytes()));
        Assert.assertTrue(ArrayUtils.isNotEmpty(singletonBytes()));
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(ArrayUtils.isEmpty(nullArray()));
        Assert.assertTrue(ArrayUtils.isEmpty(emptyArray()));
        Assert.assertFalse(ArrayUtils.isEmpty(singletonArray()));
    }

    @Test
    public void testIsNotEmpty() {
        Assert.assertFalse(ArrayUtils.isNotEmpty(nullArray()));
        Assert.assertFalse(ArrayUtils.isNotEmpty(emptyArray()));
        Assert.assertTrue(ArrayUtils.isNotEmpty(singletonArray()));
    }

    @Test
    public void getFirst() {
        String[] array = new String[]{"a", "b", "c", "d"};
        Assert.assertEquals("a", ArrayUtils.getFirst(array));
    }

    @Test
    public void getLast() {
        String[] array = new String[]{"a", "b", "c", "d"};
        Assert.assertEquals("d", ArrayUtils.getLast(array));
    }

    @Test
    public void concat() {
        String[] array1 = new String[]{"a", "b", "c", "d"};
        String[] array2 = new String[]{"e", "f", "g", "h"};
        Assert.assertEquals("[a, b, c, d, e, f, g, h]", Arrays.toString(ArrayUtils.concat(array1, array2)));
    }

    @Test
    public void testConcat() {
        byte[] array1 = new byte[]{1, 2, 3, 4};
        byte[] array2 = new byte[]{5, 6, 7, 8};
        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(ArrayUtils.concat(array1, array2)));
    }

    private byte[] nullBytes() {
        return null;
    }

    private byte[] emptyBytes() {
        return new byte[0];
    }

    private byte[] singletonBytes() {
        return new byte[]{1};
    }

    private String[] nullArray() {
        return null;
    }

    private String[] emptyArray() {
        return new String[0];
    }

    private String[] singletonArray() {
        return new String[]{"1"};
    }
}