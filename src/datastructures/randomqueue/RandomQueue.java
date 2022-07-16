package src.datastructures.randomqueue;

import java.util.Random;

public class RandomQueue<T> implements RandomQueueInterface<T> {
    private T[] items;
    private int size;

    public RandomQueue() {
        this.items= (T[]) new Object[1];
        this.size=0;
    }


    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(T item) {
        if (size==items.length)
            resize(items.length*2);

        items[size++]=item;
    }

    @Override
    public T dequeue() {
        if(isEmpty())
            throw new RuntimeException("Queue underflow");
        int randomIndex=new Random().nextInt(size);

        T randomItem=items[randomIndex];

        items[randomIndex] = items[size-1];
        items[size-1]=null;
        if(size>0 && size==items.length/4)
            resize(items.length/2);
        size--;
        return randomItem;
    }

    @Override
    public T sample() {
        if(isEmpty())
            throw new RuntimeException("Queue underflow");
        int randomIndex=new Random().nextInt(size);

        return items[randomIndex];
    }

    @Override
    public void resize(int capacity) {
        T[] temp = (T[]) new Object[capacity];
        for(int i=0;i<size;i++){
            temp[i]=items[i];
        }
        items=temp;
    }

    private static class Card{
        String value;
        String suit;

        public Card(String value, String suit){
            this.value=value;
            this.suit=suit;
        }

        @Override
        public String toString() {
            return value+"-"+suit;
        }
    }

    private static  void fillQueueWithBridgeHandsCards(RandomQueue<Card> randomQueue){
        String[] suits={"Spades","Hearts","Diamonds","Clubs"};
        for(int i=0;i< suits.length;i++){
            randomQueue.enqueue(new Card("A",suits[i]));
            randomQueue.enqueue(new Card("2",suits[i]));
            randomQueue.enqueue(new Card("3",suits[i]));
            randomQueue.enqueue(new Card("4",suits[i]));
            randomQueue.enqueue(new Card("5",suits[i]));
            randomQueue.enqueue(new Card("6",suits[i]));
            randomQueue.enqueue(new Card("7",suits[i]));
            randomQueue.enqueue(new Card("8",suits[i]));
            randomQueue.enqueue(new Card("9",suits[i]));
            randomQueue.enqueue(new Card("10",suits[i]));
            randomQueue.enqueue(new Card("J",suits[i]));
            randomQueue.enqueue(new Card("Q",suits[i]));
            randomQueue.enqueue(new Card("K",suits[i]));
        }
    }

    public static void main(String[] args) {
        RandomQueue<Card> randomQueue=new RandomQueue<>();
        RandomQueue.fillQueueWithBridgeHandsCards(randomQueue);

        for(int i=0;i<4;i++){
            int count=0;
            System.out.println("Hand "+(i+1));
            while(count<13){
                System.out.println(randomQueue.dequeue());
                count++;
            }
            System.out.println();
        }


    }
}
