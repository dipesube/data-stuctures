public class Stack{
    private int array[];
    private int top;
    private int capacity;
    //code does not include error handling
    Stack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int data){
        this.array[++top] = data;
    }

    public int pop(){
        return this.array[top--];
    }

    public int peek(){
        return this.array[top];
    }

}
