// Exercise_1 : Implement Stack using Array.
// Time Complexity : O(1)
// Space Complexity : O(n) where n is the number of items in the stack.


// Your code here along with comments explaining your approach
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //if stack is empty, then the top will be less than 0, 
        // where 0 will be the first index of the array.
        return (top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor 
        // since first element will go on the 0th index of the array.
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX - 1){
            System.out.println("Stack Overflow!");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x + " pushed onto the stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (top < 0){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            int x = a[top--];
            System.out.println(x + " popped put of the stack");
            return x;
        }
    } 
  
    int peek() 
    { 
        if (top < 0){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            int x = a[top];
            System.out.println(x + " is top of the stack");
            return x;
        }

    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
