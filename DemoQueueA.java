public class DemoQueueA {
    public static void main(String[] args) {
        QueueA test = new QueueA<>();
        test.enqueue("A");
        test.enqueue("B");
        test.enqueue("C");

        test.dequeue();

        System.out.println(test);

    }
}
