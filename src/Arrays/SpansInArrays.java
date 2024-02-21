package Arrays;

public class SpansInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in an array span is the diff btwn max and min value
		
		//normal way
		int arr[] = {5,6,1,2,3,18};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int a:arr)
		{
			min =Math.min(a, min);
			max=Math.max(a, max);
		}
		
		System.out.println("span is "+Math.abs(max-min));
		
		//functional way

	}

}
