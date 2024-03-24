package Stack;

import java.util.Stack;

public class nextgreaterEleRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {2,5,9,3,1,12,6,8,7};
		int ans[] =nextGreaterElement2(arr);
		for(int a : ans)
		{
			System.out.print(a +",");
		}

	}

	private static int[] nextGreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] ans =new int[arr.length];
		Stack<Integer> st=new Stack<Integer>();
		
		st.push(arr[arr.length-1]);
		ans[arr.length-1]=-1;
		
		for(int i =arr.length-2;i>=0;i--)
		{
			while(st.size()>0 && arr[i]>=st.peek())
			{
				st.pop();
			}
			
			if(st.size()>0)
			ans[i]=st.peek();
			else
			ans[i]=-1;
	
			st.push(arr[i]);

		}
		return ans;
	}

	private static int[] nextGreaterElement2(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] ans =new int[arr.length];
		Stack<Integer> st=new Stack<Integer>();
		st.push(0);
		
		for(int i =1;i<arr.length;i++)
		{
			
			while(st.size()>0 && arr[i]>arr[st.peek()])
			{
				ans[st.peek()]=arr[i];
				st.pop();
			}
			st.push(i);
			
		}
		while(st.size()>0)
		{
			ans[st.pop()]=-1;
		}
		return ans;
	}
}
