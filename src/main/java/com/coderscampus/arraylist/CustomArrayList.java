package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size = 0;

    @Override
    public boolean add(T item) {
        if (this.size == items.length) {
            makeArrayBigger();
        }

        if (this.size < items.length) {
            if (items[size] == null) {
                items[size] = item;
                size++;
                return true;
            }
        }
        return false;
    }

    //New function: adds at index
    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException{
        if (size == this.items.length) {
            makeArrayBigger();
        }

        for (int i = this.size -1; i >= index; i--){
            if (index == i) {
                this.items[index] = item;
                return true;
            }
            items[i] = items[i - 1];
        }
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        return (T)items[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException{
        T removedValue = (T)this.items[index];
        if(index == this.size - 1){
            this.items[index] = null;
            return removedValue;
        }
        for(int i = index; i < size - 1; i++){
            this.items[index] = this.items[index + 1];
        }
        return removedValue;
    }

    // Same as Arrays.copyOf:
    void makeArrayBigger() {
        Object[] items = new Object[this.items.length * 2];
        for (int i = 0; i < this.items.length - 1; i++) {
            items[i] = this.items[i];

        }
        this.items = items;
    }
}
