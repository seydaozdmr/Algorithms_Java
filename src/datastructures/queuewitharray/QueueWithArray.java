package src.datastructures.queuewitharray;

import java.util.Arrays;
import java.util.Iterator;

public class QueueWithArray<T> implements Iterable<T>{
    private T [] arr;
    private int n;
    private int first;
    private int last;

    public QueueWithArray() {
        this.arr= (T[]) new Object[2];
        n=0;
        first=0;
        last=0;
    }

    public void enqueue(T elem){
        if(n==arr.length){
            resize(arr.length*2);
        }

        arr[last++]=elem;
        n++;
    }

    public void resize(int newCapacity){
        T [] tempArr= (T[]) new Object[newCapacity];
        int elem=first;
        for(int i=0;i<n;i++){
            tempArr[i]=arr[elem++];
        }
        arr=tempArr;
        first=0;
        last=n;
    }

    public T dequeue(){
        if(n==0){
            throw new RuntimeException("kuyruk boş");
        }
        T temp=arr[first];
        arr[first]=null;
        first++;
        n--;
        if(n>0 && n== arr.length/2){
            resize(arr.length/2);
        }
        return temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            T[]temp=arr;
            int i=first;
            @Override
            public boolean hasNext() {
                return temp[i]!=null;
            }

            @Override
            public T next() {
                T tempElem=temp[i];
                i++;
                return tempElem;
            }
        };
    }

    public int size(){
        return n;
    }
}
