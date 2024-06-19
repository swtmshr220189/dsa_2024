package com.datastructure.queue;

import com.datastructure.stack.StackUsingArray;


public class QueueUsingLinkedList {

    //Using Front and Rear so that pop and offer is done with O(1)
    Node front; //head
    Node rear; //tail

    QueueUsingLinkedList() {
        front = rear = null;
    }


    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    //insert
    void offer(int d) {
        Node newNode = new Node(d);
        //first insertion
        if (front == null) {
            front = rear = newNode;
            return;
        }
        //already existing queue insertion
        rear.next = newNode;
        rear = newNode;
    }

    int pop() {
        //return the front
        if (front == null) {
            rear = null;
            return -1;
        } else {
            Node removeNode = front;
            front = front.next;
            return removeNode.data;
        }

    }

    void printQueue() {
        Node newNode = front;
        while (newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }
    }

    int size() {
        Node newNode = front;
        int count = 0;
        while (newNode != null) {
            count++;
            newNode = newNode.next;
        }
        return count;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList myQueue = new QueueUsingLinkedList();
        myQueue.offer(1);
        myQueue.offer(27);
        myQueue.offer(28);
        myQueue.offer(26);
        myQueue.offer(23);
        myQueue.offer(21);
        myQueue.offer(24);

        System.out.println("Size is : " + myQueue.size());
        myQueue.printQueue();


        System.out.println("pop : " + myQueue.pop());
        System.out.println("pop : " + myQueue.pop());
        System.out.println("Size is : " + myQueue.size());
        myQueue.printQueue();

        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        System.out.println("pop : " + myQueue.pop());
        System.out.println("pop : " + myQueue.pop());
        System.out.println("Size is : " + myQueue.size());
        myQueue.printQueue();
    }

}
