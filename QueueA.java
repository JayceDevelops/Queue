public class QueueA<E> implements QueueI<E>{
    
    private E[] queue;
    private int front;
    private int size;
    
    QueueA() {
        this(DEFAULT_CAPACITY);
    }

    QueueA(int capapacity) {
        queue = (E[]) new Object[capapacity];
    }

    @Override
    public void enqueue(E obj) {
        if (isFull()){
            System.err.println("Capacity Reached.");
            return;
        }

        // Find back: front + size
        // Wrap: mod on arr length
        int position = (front + size) % queue.length;
        queue[position] = obj;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            System.err.println("Capacity Reached.");
            return null;
        }

        E tmp = queue[front];
        queue[front] = null;
 
        front = ++front % queue.length;
        size--;
        return tmp;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }

        return queue[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return  size == queue.length;
    }

    @Override 
    public String toString(){
        String str = "";

        for (int i = 0; i < queue.length; i++){
            str += queue[i] + " : ";
        }

        str += "front: " + front;
        str += "\nsize: " + size;

        return str;
    }
}