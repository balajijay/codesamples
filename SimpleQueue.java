package Balaji;

import java.util.ArrayList;

public class SimpleQueue <T> {

	private ArrayList<T> queue;
	private int size = 0;
	
	public SimpleQueue(int size) {
		this.queue = new ArrayList<>();
		this.size = size;
	}
	
	public ArrayList<T> getQueue() {
		return this.queue;
	}
	
	public void enqueue(T t) {
		this.queue.add(t);
	}
	
	public T dequeue() {
		T t = queue.remove(0);
		return t;
	}
	
	public int getSize() {
		return this.queue.size();
	}
	
	public static void main(String[] args) {
		
		SimpleQueue sQueue = new SimpleQueue(5);
		sQueue.enqueue(1);
		sQueue.enqueue(2);
		sQueue.enqueue(3);
		// display the queue
		sQueue.queue.forEach(elem -> {
			System.out.println("Element is " + elem);
		});
		System.out.println("Queue size is " + sQueue.getSize());
		System.out.println("Element dequeued is " + sQueue.dequeue());
		// display the queue and print its size
		sQueue.queue.forEach(elem -> {
			System.out.println("Element is " + elem);
		});
		System.out.println("Queue size is " + sQueue.getSize());
	}
}
