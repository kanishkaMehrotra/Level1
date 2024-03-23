package Stack;

import java.util.Stack;

public class DupeBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="((a+b)+(c+d))";
		String s2 ="(a+b)+((c+d))";
		
		System.out.println(s2 +" has dupe brackets -->"+isDupeBracket(s2));
		

	}

	private static boolean isDupeBracket(String s1) {
		// TODO Auto-generated method stub
		
		boolean ans =false;
		Stack<Character> st =new Stack<Character>();
		
		for(char c : s1.toCharArray())
		{
			if(c ==')' )
			{
				if(st.peek()=='(')
					return true;
				else
				{
				while(st.peek()!='(')
					st.pop();
				}
				st.pop();
			}
			else 
			st.push(c);
			
		}
		return ans;
	}

}
