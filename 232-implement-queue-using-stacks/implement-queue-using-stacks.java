class Node{
    int data;
    Node next;
   
    Node(int x){
        data = x;
        next = null;
    }
}
class MyQueue {
    Node head, rear;
    public MyQueue() {
       head = null;
       rear = null; 
    }
    
    public void push(int x) {
        Node newNode = new Node(x);

        if(head == null)
        {
            head = newNode;
            rear = newNode;        
        } else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    
    public int pop() {
        if(head == null){
            return -1;
        }
        int value = head.data;
        head = head.next;
        
        if(head == null){
            rear = null;
        }

        return value;
    }
    
    public int peek() {
        if(head == null)
        {
            return -1;
        }else{
            return head.data;
        }
    }
    
    public boolean empty() {
        if(head == null)
        {
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */