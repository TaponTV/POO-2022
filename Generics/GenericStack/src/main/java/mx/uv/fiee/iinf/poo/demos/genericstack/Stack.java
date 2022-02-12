package mx.uv.fiee.iinf.poo.demos.genericstack;

public class Stack<T> {
    private T [] vector;
    private int top, max;
    
    public Stack (int size) {
        //vector = new T [size];
        vector = (T []) new Object [size];
        top = -1;
        max = size;
    }
    
    public void push (T item) {
        if (top == max) throw new Error ("Stack is full");
        
        top++;
        vector [top] = item;
    }
    
    public T pop () {
        return vector [top--];
    }
    
    public boolean isEmpty () {
        return top == -1;
    }
        
}