package DSA;

class Stack {
	private int size;

	Stack(int size) {
		this.size = size;
	}

	private int top = 0;
	private int arr[] = new int[size];

	void push(int value) {
		if (top == size) {
			System.out.println("Stack is overflow.");
		} else {
			arr[top] = value;
			top++;
			System.out.println(value + " was added to stack.");
		}
	}

	void pop() {
		if (top == 0) {
			System.out.println("Stack is underflow.");
		} else {
			System.out.println(arr[top] + " was poped from stack.");
			top--;
		}
	}

	boolean isFull() {
		if (top >= size) {
			System.out.println("Stack is full.");
			return true;
		} else {
			System.out.println("Stack is not full.");
			return false;
		}
	}

	boolean isEmpty() {
		if (top == 0) {
			System.out.println("Stack is empty.");
			return true;
		} else {
			System.out.println("Stack is not empty.");
			return false;
		}
	}

	void peek(int index) {
		if (index > top) {
			System.out.println("This index doesn't exist.");
		} else {
			System.out.println(arr[index]);
		}
	}

	void count() {
		System.out.println(top);
	}

	void change(int index, int value) {
		if (index > top) {
			System.out.println("This index doesn't exist.");
		} else {
			arr[index] = value;
			System.out.println("Changed successfully");
		}
	}

	void display(){
		for (int i = size; i > top; i--) {
			System.out.println("empty");
		}
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
