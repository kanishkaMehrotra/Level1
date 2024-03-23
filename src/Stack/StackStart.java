package Stack;

import java.util.Stack;

public class StackStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		System.out.println(st +"->"+st.peek()+" "+st.size());
		st.push(2);
		System.out.println(st +"->"+st.peek()+" "+st.size());
		st.push(3);
		System.out.println(st +"->"+st.peek()+" "+st.size());
		st.pop();
		System.out.println(st +"->"+st.peek()+" "+st.size());
		System.out.println(st.pop());
		System.out.println(st +"->"+st.peek()+" "+st.size());

	}

}
