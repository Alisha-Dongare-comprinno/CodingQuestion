package stackImplementation;

public class StackArrayImplementaion{
    int top;
    int capacity;
    int[] stack;
    StackArrayImplementaion()
    {
        top=-1;
        capacity = 10;
        stack= new int[capacity];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == capacity -1;
    }
    public int push(int data)
    {
       if(isFull()){
           System.out.println("Stack is Full");
       }
       return stack[++top] = data;
    }
    public int pop()
    {
        if(isEmpty()){
          System.out.println("stack is empty");  
        }
        return stack[top--];
    }
    
    public int peek()
    {
        return stack[top];
    }
    public void display(){
        for(int i : stack)
        {
            System.out.println();   
        }
    }
    public static void main(String[] args){
        StackArrayImplementaion st = new StackArrayImplementaion();

         st.push(34);
         st.push(314);
         st.push(24);
         st.push(14);
         st.push(40);
    System.out.println(st.isEmpty());    
    System.out.println(st.isFull());
    System.out.println(st.capacity);
    System.out.println(st.peek());
    System.out.println(st.pop());
    System.out.println(st.peek());
    st.display();
    }
}
