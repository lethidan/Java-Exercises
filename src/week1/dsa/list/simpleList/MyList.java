package week1.dsa.list.simpleList;


import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


//    Implement the ensureCapa() method
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

//    Implement the add() method

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

//    Implement the get() method
    public  E get(int index) {
        if (index>= size || index<0) {
            throw new IndexOutOfBoundsException("Index: " + index +",Size: " + index);

        }
        return (E) elements[index];
    }

}
