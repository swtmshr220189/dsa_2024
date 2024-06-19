package com.datastructure.stack;

public class StackUsingArray{
    //Assignment 2 :  implement stack using dynamic size of array,
    // consider initial capacity as 10
    // and double the size whenever it occupied the complete memory

    //push
    //pop
    //peek
    //isEmpty
    //size

    int top;
    int cap;
    int[] arr;

    StackUsingArray(){
        this.cap = 10;
        this.top = -1;
        this.arr = new int[cap];

    }

    void resize(){
        cap = cap*2;
        int[] newArr = new int[cap];
        System.arraycopy(arr,0,newArr,0,size());
        arr = newArr;
    }
    void push(int data){
        //Check if Array is Full
        if(size()==cap){
            resize();
        }
        top++;
        arr[top] = data;
    }

    int pop(){
        int res = arr[top];
        top--;
        return res;
    }

    int peek(){
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top+1;
    }

    void printStack(){
        for(int i=0; i<size();i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
//        StackUsingArray myStack = new StackUsingArray(10);
        StackUsingArray myStack = new StackUsingArray();
        myStack.push(1);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(21);
        myStack.push(32);
        myStack.push(25);
        System.out.println("Size is : "+myStack.size());
        myStack.printStack();
        System.out.println("More than 10 now");
        myStack.push(25);
        myStack.push(1);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(21);
        myStack.push(32);
        System.out.println("Size is : "+myStack.size());
        myStack.printStack();
        System.out.println("More than 20 now");
        myStack.push(2225);
        myStack.push(1);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(20);
        myStack.push(21);
        myStack.push(32);
        System.out.println("Size is : "+myStack.size());
        myStack.printStack();
    }
}

