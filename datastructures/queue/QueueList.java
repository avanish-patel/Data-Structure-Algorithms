package datastructures.queue;


class Qnode{

    int data;
    Qnode next;

    Qnode(int data) {

        this.data = data;
        next = null;
    }

}
class QueueL{

    Qnode front, rear;

    QueueL() {

        this.front = this.rear = null;
    }

    // method to enqueue new key to queue
    void enqueue(int key) {

        Qnode temp = new Qnode(key);

        // if their is no data than front and rear are same
        if (this.rear == null) {

            this.front = this.rear = temp;
        }

        rear.next = temp;

        rear = temp;
    }

    // method to dequeue
    Qnode dequeue() {

        if (front == null) {

            return null;
        }
        Qnode temp = front;

        front = front.next;
        if (front == null) {

            rear = null;
        }

        return temp;

    }

    void printQueue() {

        Qnode current = this.front;
        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;

        }
    }

}
public class QueueList {

    public static void main(String[] args) {

        QueueL q = new QueueL();

        q.enqueue(23);
        q.enqueue(78);
        q.enqueue(89);
        q.enqueue(78);
        q.enqueue(12);


        q.printQueue();

        q.dequeue();
        q.dequeue();

        System.out.println();
        q.printQueue();
    }
}
