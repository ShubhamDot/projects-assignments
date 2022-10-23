import java.util.Stack;
class StackDelete {
    
    public static void del(Stack<Character> st, char el){
        if(st.peek() == el){
            st.pop();
            return;
        }
        else{
            System.out.println("element not found");
            return;
        }
        
    }
    
    public static void delete_el(Stack<Character> st, char element){
        while(!st.empty()){
            char x = st.peek();
            st.pop();
                
            if(x == element){
                del(st , element);
                return;
            }
            
            delete_el(st, element);
            
            st.push(x);
        }
        System.out.println("stack is empty");
        return;
    }
    
    public static void main(String args[])
    {
        Stack<Character> st = new Stack();
 
        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
 
        
        while (!st.empty()) {
            char p = st.peek();
            st.pop();
            System.out.print(p + " ");
        }
        
        delete_el(st , '4');
        
        while (!st.empty()) {
            char p = st.peek();
            st.pop();
            System.out.print(p + " ");
        }
    }
}
