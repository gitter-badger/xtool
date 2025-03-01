package com.igeeksky.xtool.core.function;

import java.util.Iterator;

/**
 * 元组工具类
 *
 * @author Patrick.Lau
 * @since 0.0.4 2021-11-16
 */
public class Tuples {

    private Tuples() {
    }

    public static <T1> Tuple1<T1> of(T1 t1) {
        return new Tuple1<>(t1);
    }

    public static <T1, T2> Tuple2<T1, T2> of(T1 t1, T2 t2) {
        return new Tuple2<>(t1, t2);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> of(T1 t1, T2 t2, T3 t3) {
        return new Tuple3<>(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(T1 t1, T2 t2, T3 t3, T4 t4) {
        return new Tuple4<>(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return new Tuple5<>(t1, t2, t3, t4, t5);
    }

    protected static class TupleIterator implements Iterator<Object> {

        private final Object[] table;
        private int index;

        public TupleIterator(Object[] table) {
            this.table = table;
        }

        @Override
        public boolean hasNext() {
            return index < table.length;
        }

        @Override
        public Object next() {
            return table[index++];
        }
    }
}