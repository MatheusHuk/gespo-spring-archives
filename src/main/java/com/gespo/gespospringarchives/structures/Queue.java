package com.gespo.gespospringarchives.structures;

import com.gespo.gespospringarchives.structures.exceptions.QueueException;

public class Queue <T> {

    private int size;

    private T[] queue;

    public Queue(int size) {
        this.queue = (T[]) new Object[size];
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return this.size == this.queue.length;
    }

    public void insert(T value) throws QueueException {
        if(!this.isFull())
            this.queue[this.size++] = value;

        else throw new QueueException("Queue is full");

    }

    public T peek() throws QueueException {
        if(!this.isEmpty())
            return this.queue[0];

        else throw new QueueException("Queue is empty");
    }

    public T poll() throws QueueException {

        if(!this.isEmpty()){

            T nextValue = this.peek();

            for (int i = 0; i < size - 1; i++)
                this.queue[i] = this.queue[i + 1];

            size--;
            return nextValue;
        }

        else throw new QueueException("Queue is empty");
    }

}
