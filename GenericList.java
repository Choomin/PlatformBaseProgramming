package edu.pnu.collection;
import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;

public class GenericList<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    private static final Object[] EMPTY_ARRAY = {};

    Object[] array;

    public GenericList() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }
    public GenericList(int size) {
        this.array = new Object[size];
        this.size = 0;
    }


    private void resize() {
        int array_size = array.length;

        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_SIZE];
            return;
        }

        if (size == array_size) {
            int new_size = array_size * 2;
            array = Arrays.copyOf(array, new_size);
            return;
            }

        if (size < (array_size / 2)) {
            int new_size = array_size / 2;
            array = Arrays.copyOf(array, Math.max(new_size, DEFAULT_SIZE));
            return;
        }
    }

    public boolean add(T value) {
        addLast(value);
        return true;
        }

    public void addLast(T value) {
        if (size == array.length) {
                resize();
        }
        array[size] = value;
        size++;
    }

    public T get (int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
        resize();
    }

    public int size() { return this.size; }


}
