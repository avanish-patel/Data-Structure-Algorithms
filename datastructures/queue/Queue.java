package datastructures.queue;

// implementation of queue using array
class Queue {


    int front,rear,size;
    int capacity;
    int arr[];

    // constructor to initialize the variables
    Queue(int capacity) {

        this.capacity = capacity;
        this.front = 0;
        this.size =0;
        this.rear = capacity-1;
        arr = new int[this.capacity];
    }

    // queue is full when size equals to capacity
    private boolean isFull(Queue queue) {

        return (this.size == this.capacity);
    }

    // queue is empty when size is 0
    private boolean isEmpty(Queue queue) {

        return (this.size == 0);
    }

    // enqueue the item and increase size and rear
    private void enqueue(int item) {

        if (isFull(this)) {
            return;
        }

        this.rear = (this.rear + 1) % this.capacity;

        this.arr[this.rear] = item;
        this.size = size+1;

        System.out.println(item+ " enqueued.");

    }

    private int dequeue() {

        if (isEmpty(this)) {

            return Integer.MIN_VALUE;
        }

        int item = this.arr[front];

        this.front = (this.front+1) % this.capacity;

        this.size = this.size-1;

        return item;
    }

    private int front(){

        return this.arr[this.front];
    }

    private int rear(){

        return this.arr[this.rear];
    }

    // Main method
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enqueue(34);
        queue.enqueue(45);
        queue.enqueue(78);
        queue.enqueue(90);
        queue.enqueue(23);

        System.out.println(queue.dequeue() + " Dequeued");
        System.out.println(queue.dequeue() + " Dequeued");

        System.out.println("Front : "+ queue.front());
        System.out.println("Rear : " + queue.rear());
    }

}
