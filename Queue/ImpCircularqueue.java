class MyCircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularQueue(int k){
        capacity = k;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue(){   
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front(){
        if (isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int Rear(){
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(3);
        System.out.println(queue.enQueue(10)); 
        System.out.println(queue.enQueue(20)); 
        System.out.println(queue.enQueue(30)); 
        System.out.println(queue.enQueue(40));  

        System.out.println(queue.Rear());      
        System.out.println(queue.isFull());    

        System.out.println(queue.deQueue());    
        System.out.println(queue.enQueue(40));

        System.out.println(queue.Rear());      
        System.out.println(queue.Front());      
    }
}