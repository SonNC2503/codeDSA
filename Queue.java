package queuemessage;
public class Queue {
    int front, rear,  size;
    int capacity;
    Message message[];
    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        message = new Message[this.capacity];
    }
    boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }
    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    } 
    void enqueue(Message item){
        if (isFull(this)){
            System.out.println("Queue is full!");
            return;
        }    
        this.rear = (this.rear + 1) % this.capacity;
        this.message[this.rear] = item;
        this.size = this.size + 1;
        System.out.println("Add message successful!");
        System.out.println("------------------------------------");
    }
    Message dequeue(){
        if (isEmpty(this)){
            System.out.println("Queue is empty!");
            return null;   
        }
        Message item = this.message[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println("Dequeue successfully!!!");
        return item;
    }
    void display(){
        int s;
        if (isEmpty(this)){
            System.out.println("No message");
            return; 
        }
        System.out.println("All the messages you just typed");
        System.out.println("-----------------------------");
        for(s=front; s <= rear; s++){
            System.out.println("the massage from " + message[s].getCopany() + " and the message is: " + message[s].getData());
        }
        System.out.println("");
        return;
    }
}
