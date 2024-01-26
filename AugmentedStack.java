
// Student name : Melika Sherafat
// Student ID : 218970871


package mell;
import java.util.Stack;

public class AugmentedStack<T extends Comparable<T>> {
    private Stack<T> data;
    private Stack<T> min;

    public AugmentedStack() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(T x) {
        data.push(x);
        if (min.isEmpty() || x.compareTo(min.peek()) <= 0) {
            min.push(x);
        }
    }

    public T pop() {
        if (data.isEmpty()) {
            return null;
        }

        T popped = data.pop();
        if (popped.equals(min.peek())) {
            min.pop();
        }
        return popped;
    }

    public T getMin() {
        if (min.isEmpty()) {
            return null;
        }
        return min.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public T top() {
        if (data.isEmpty()) {
            return null;
        }
        return data.peek();
    }

    public static void main(String[] args) {
        AugmentedStack<Integer> s = new AugmentedStack<>();
        s.push(5);
        s.push(2);
        s.push(7);
        s.push(-1);
        
        System.out.println("Top: " + s.top()); 
        System.out.println("Min: " + s.getMin()); 

        s.pop();
        System.out.println("Min after pop: " + s.getMin()); 
    }
}
