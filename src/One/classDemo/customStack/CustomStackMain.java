package One.classDemo.customStack;

public class CustomStackMain  {
    static void main(String[] args) throws Exception{

        DynamicStack stack = new DynamicStack();

        stack.push(10);
        stack.push(23);
        stack.push(23);
        stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
