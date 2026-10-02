
import java.util.LinkedList;

public class QueueL implements QueueI<Object>{

    private LinkedList queue;
    private int size;
    
    public QueueL() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(Object obj) {
        // Find back: front + size
        // Wrap: mod on arr length
        queue.addLast(obj);
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()){
            System.err.println("Capacity Reached.");
            return null;
        }

        Object tmp = queue.pop();
        size--;
        return tmp;
    }

    @Override
    public Object peek() {
        if (isEmpty()){
            return null;
        }

        return queue.getFirst();
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
        return  false;
    }

    @Override 
    public String toString(){
        String str = "";

        for (Object element : queue){
            str += element + " : ";
        }

        return str;
    }

    
}
