
class twoStacks {
    
    public LinkedList<Integer> l;
    twoStacks() {
        l = new LinkedList<>();
        l.add(-1);
    }
    // Function to push an integer into the stack1.
    void push1(int x) {
        l.addFirst(x);
    }
        
    // Function to push an integer into the stack2.
    void push2(int x) {
        l.addLast(x);
    }
        
    // Function to remove an element from top of the stack1.
    int pop1() {
        if(l.get(0) == -1)  return -1;
        return l.removeFirst();
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(l.get(l.size()-1) == -1)  return -1;
        return l.removeLast();
    }
}
