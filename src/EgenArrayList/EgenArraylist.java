package EgenArrayList;

import java.util.Arrays;

public class EgenArraylist<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public EgenArraylist() {
        elements = new Object[4];
        size = 0;

    }

    public void add(E data) {
        if (size == elements.length) {
            resizeArray();
        }
        elements[size++] = data;

    }

    public void remove(int data) {
        if (data < 0 || data >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = data; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[--size] = null;

    }

    public E get(int index) throws RuntimeException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;

    }

    private void resizeArray() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "EgenArraylist{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}