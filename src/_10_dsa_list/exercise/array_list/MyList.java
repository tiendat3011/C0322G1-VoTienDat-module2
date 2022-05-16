package _10_dsa_list.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E remove1 = (E) elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return remove1;
    }

    public int size() {
        return size;
    }

    public E clone(Object[] newArr) {
        elements = newArr;
        return (E) elements;
    }
    public boolean contains(E o) {
        for ( Object element: elements) {
            if (element == o){
                return true;
            }
        }
        return false;
    }

}


