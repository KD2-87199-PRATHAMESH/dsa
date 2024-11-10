package day02;

public class Queue {
	private int arr[];
	private int size;
	private int rear;

	public Queue(int s) {
		size = s;
		arr = new int[size];
		rear = -1;
	}

	public void enqueue(int ele) {
		if (rear < size - 1) {
			rear = rear + 1;
			arr[rear] = ele;
		} else
			System.out.println("Queue is full...!");
	}

	public int peek() {
		if (rear == -1)
			return -1;
		return arr[0];
	}

	public int dequeue() {
		int deleted = arr[0];
		for (int i = 0; i < rear; i++)
			arr[i] = arr[i + 1];
		if (rear != -1) {
			rear--;
			return deleted;
		}
		return -1;
	}
}
