package _10_dsa_list.exercise.array_list;

import java.util.Arrays;

public class NewMyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public NewMyList(int capacity) {
        elements = new Object[capacity];
    }

    public NewMyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(int minCapacity) {// tăng kích thước của mảng
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e) {// thêm pt vào cuối arrlist
        if (size == elements.length) {
            ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E element) {// thêm pt vào vị trí index
        for (int i = size - 1; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public int size() {
        return this.size;
    }

    public E remove(int index) { // xoá phần tử tại index
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) elements;
    }

    public int indexOf(E o) {// tìm phần tử tại index
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) { // lấy ra 1 pt trong mảng
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() { // xoá hết các pt có trong mảng
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

    public boolean contains(E o) {// kiểm tra pt có trong mảng không
        if (indexOf(o) != -1) {
            return true;
        }
        return false;
    }

    public E clone() {
        Object[] newList = new Object[DEFAULT_CAPACITY];
        if (size == elements.length) {
            ensureCapacity(5);
        }
        for (int i = 0; i < size(); i++) {
            newList[i] = elements[i];
        }
        return (E) Arrays.toString(newList);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("["); // Stringbuid dùng để tạo chuỗi có thể thay đổi,
                                                        // với xử lý đa luồng
        for (int i = 0; i < size; i++) {
            if (elements[i] == null)
                break;
            result.append(elements[i]); // append nối thêm tham số vaoo` chuỗi
            if (i < size - 1)
                result.append(", ");
        }

        return result.toString() + "]";
    }
}