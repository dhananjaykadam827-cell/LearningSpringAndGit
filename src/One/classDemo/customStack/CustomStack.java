package One.classDemo.customStack;

public class CustomStack {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
        int ptr = -1;
    public  CustomStack() {
        this(DEFAULT_SIZE);
    }
        public CustomStack(int size){
            this.data = new int[size];
        }

        public boolean push(int item){
        if(isFull()){
            System.out.println("at last  index");
            return  false;
        }
                ptr++;
                data[ptr] = item;
                return true;
        }

    public boolean isFull() {
        return ptr == data.length-1;

    }
    public   boolean isEmpty(){
        return ptr == -1;
    }

    public  int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot pop from empty stack");
        }
           int removed = data[ptr];
        ptr--;
        return removed;
    }

    public  int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot peek from empty stack");
        }
        return data[ptr];
    }



}
