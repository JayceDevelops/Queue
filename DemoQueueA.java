public class DemoQueueA {
    public static void main(String[] args) {
        QueueA queue1 = new QueueA<>();
        QueueL queue2 = new QueueL();
        
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);

        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);

        System.out.println("enqueue Test\n-------");
        printThese(queue1, queue2);

        queue1.dequeue();
        queue2.dequeue();

        System.out.println("dequeue Test\n-------");
        printThese(queue1, queue2);

        System.out.println("Peek Test\n-------");
        printThese(queue1.peek(), queue1.peek());

        System.out.println("Size Test\n-------");
        printThese(queue1.size(), queue1.size());

        System.out.println("isEmpty Test\n-------");
        printThese(queue1.isEmpty(), queue1.isEmpty());

        System.out.println("isFull Test\n-------");
        printThese(queue1.isFull(), queue1.isFull());
    }

    private static void printThese(Object stack1, Object stack2){
        System.out.println(stack1);
        System.out.println();
        System.out.println(stack2);
        System.out.println();
        System.out.println();
    }  
}
