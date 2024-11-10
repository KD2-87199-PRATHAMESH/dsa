package day02;

public class CircularQueue {
	private int arr[];
	private int size;
	private int front;
	private int rear;

	public CircularQueue(int s) {
		size = s;
		rear = front = -1;
		arr = new int[s];
	}

	public void enq(int data) {
		rear = (rear + 1) % size;
		arr[rear] = data;
	}

	public int deq() {
		int pop = arr[(front + 1) % size];
		front = (front + 1) % size;
		if (front == rear)
			front = rear = -1;
		return pop;
	}

	public int peek() {
		return arr[(front + 1) % size];
	}

	public boolean isEmpty() {
		return front == rear && front == -1;
	}

	public boolean isFull() {
		return (front == -1 && rear == size - 1) || (front == rear && front != -1);
	}
}
