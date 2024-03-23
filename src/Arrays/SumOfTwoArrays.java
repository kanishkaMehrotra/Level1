package Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=   {9,9,8};
		int arr2[]= {1,1,1,1};
		int ans[]=new int[Math.max(arr1.length, arr2.length)];
		
		int sum=0;
		int c=0;
		int l1=arr1.length-1;
		int l2=arr2.length-1;
		int k =ans.length-1;
		
		while(k>=0)
		{
			 sum=c;
			 if(l1>=0)
				 sum=arr1[l1]+sum;
			 if(l2>=0)
				 sum=arr2[l2]+sum;
			 
			 c=sum/10;
			 sum=sum%10;
			 
			 ans[k]=sum;
			 
	         l1--;
	         l2--;
	         k--;

		}
		
		if(c>0)
		{
			System.out.println(c);
		}
		for(int i :ans)
			System.out.print(i);
	}

}
