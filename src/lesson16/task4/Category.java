package lesson16.task4;

import java.util.*;

public class Category {
    private String name;

    public static void main(String[] args) {
        Set<Goods> seOfGoods = new SortedSet<Goods>() {
            @Override
            public Comparator<? super Goods> comparator() {
                return null;
            }

            @Override
            public SortedSet<Goods> subSet(Goods fromElement, Goods toElement) {
                return null;
            }

            @Override
            public SortedSet<Goods> headSet(Goods toElement) {
                return null;
            }

            @Override
            public SortedSet<Goods> tailSet(Goods fromElement) {
                return null;
            }

            @Override
            public Goods first() {
                return null;
            }

            @Override
            public Goods last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Goods> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Goods goods) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Goods> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

        };
    }
}