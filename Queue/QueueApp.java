
public class QueueApp {

	public static void main(String[] args) {
		Queue myQueue = new Queue();
		myQueue.enqueue("1");
		myQueue.enqueue("2");
		myQueue.enqueue("3");
		System.err.println("size: " + myQueue.getSize());
		System.err.println(myQueue.dequeue().toString());
		System.err.println(myQueue.dequeue().toString());
		System.err.println("size: " + myQueue.getSize());
		myQueue.enqueue("4");
		myQueue.enqueue("5");
		System.err.println(myQueue.dequeue().toString());
		System.err.println(myQueue.dequeue().toString());
		System.err.println("size: " + myQueue.getSize());
		System.err.println(myQueue.dequeue().toString());
		System.err.println("size: " + myQueue.getSize());
		System.err.println(myQueue.dequeue().toString());
		System.err.println("size: " + myQueue.getSize());
		

	}

}
