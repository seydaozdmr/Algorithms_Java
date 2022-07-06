package src.datastructures;

import java.util.Iterator;

public class MyStack<T> implements Stackable<T>,Iterable<T>{
    private T [] items;
    private int size;
    private final int CAPACITY=2;

    public MyStack() {
        this.items= (T[]) new Object[CAPACITY];
        size=0;
    }

    private void resizeCapacity(int newCapacity){
        T[] temp= (T[]) new Object[newCapacity];
        for(int i=0;i< items.length;i++){
            temp[i]=items[i];
        }
        items=temp;

    }

    @Override
    public void push(T t) {
        if(size==items.length){
            resizeCapacity(items.length*2);
        }
        items[size++]=t;
    }

    @Override
    public T pop() {
        T temp =null;
        if(!isEmpty()){
            temp=items[size];
            items[size]=null;
            size--;
        }else{
            System.out.println("stack is empty");
        }
        if(size/2<items.length && size>2){
            resizeCapacity(items.length/2);
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return items.length==0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int elems=size-1;

            @Override
            public boolean hasNext() {
                if(elems>-1)
                    return items[elems]!=null;
                return false;
            }

            @Override
            public T next() {
                T temp=items[elems];
                elems--;
                return temp;
            }
        };
    }

    public void writeElements(){
        Iterator<T> iterator=iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
}
