import java.util.NoSuchElementException;

public class QuestionThree<Element> {

	private Element[] queueArray;
	private int front;
	private int rear;
	private int capacity;
	public int numberOfElements;
	
	
	public QuestionThree(int size) {
		this.capacity = size;
		this.front = -1;
		this.rear = -1;
		this.queueArray = (Element[]) new Object[this.capacity];
		this.numberOfElements = 0;
	}
	

	public int getFront() {
		return this.front;
	}

	
	public int getRear() {
		return this.rear;
	}

	
	public int getNumberOfElements() {
		return this.numberOfElements;
	}
    
	public Element[] getQueueArray() {
		return this.queueArray;
	}

	
	public boolean isEmpty() {
		return this.numberOfElements == 0;
	}
    
	
	public boolean isFull() {
		return this.numberOfElements == this.capacity;
	}

	public void enqueue(Element element) throws NoSuchElementException {
		if (isFull())
			throw new IllegalStateException("Queue is full");
		if (element == null)
			throw new NullPointerException("Element is null");
		else {
			if (isEmpty()) {
				front = rear = 0;
			}
			if (rear > numberOfElements) { 
				rear = 0;
			}
			queueArray[rear] = element;
			rear++;
			this.numberOfElements++;
		}
	}
	
	public Element dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Empty queue.");
		Element result = queueArray[front];
		queueArray[front] = null;
		front++;
		this.numberOfElements--;
		return result;
	}
}