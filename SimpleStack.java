package Balaji;

import java.util.ArrayList;

public class SimpleStack <T> {

	private ArrayList<T> queue;
	private int size = 0;
	
	public SimpleStack(int size) {
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
		T t = queue.remove(queue.size()-1);
		return t;
	}
	
	public int getSize() {
		return this.queue.size();
	}
	
	public static void main(String[] args) {
		
		SimpleStack stack = new SimpleStack(5);
		stack.enqueue(1);
		stack.enqueue(2);
		stack.enqueue(3);
		// display the queue
		stack.queue.forEach(elem -> {
			System.out.println("Element is " + elem);
		});
		System.out.println("Queue size is " + stack.getSize());
		System.out.println("Element dequeued is " + stack.dequeue());
		// display the queue and print its size
		stack.queue.forEach(elem -> {
			System.out.println("Element is " + elem);
		});
		System.out.println("Queue size is " + stack.getSize());
	}
}
