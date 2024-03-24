package Stack;

import java.util.Stack;

public class BalanceBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="[(a+b)+{(c+d)*(e/f)}]"; //true
		String s2 ="[(a+b)+{(c+d)*(e/f)]}"; //false
		String s3 ="[(a+b)+{(c+d)*(e/f)}"; //false
		String s4 ="([(a+b)+{(c+d)*(e/f)}]"; //false

		System.out.println(s1 +" has dupe brackets -->"+isBalancedBracket(s1));

	}

	private static boolean isBalancedBracket(String s1) {
		// TODO Auto-generated method stub
		boolean ans=true;
		Stack<Character> st =new Stack<Character>();
		int open =0;
		for(char c : s1.toCharArray())
		{
			if(c =='{' ||c=='[' ||c == '(')
			{
				st.push(c);
				open ++;
			}
			else
			{
				if( open >0 && (
						(c==')' && st.peek()=='(')||
						(c==']' && st.peek()=='[') ||
						(c=='}' && st.peek()=='{'))
						)
				{
					st.pop();
					open --;
				}
				
			
			}
		}
		
		if(open>0)
			ans=false;
		
		
		return ans;
	}

}
