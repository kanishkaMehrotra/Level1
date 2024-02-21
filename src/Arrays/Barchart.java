package Arrays;

public class Barchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ip 3,1,0,7,5
		 * 
		 * 
		 * 
		 *        *
		 *        * 
		 *        * *
		 *        * *
		 *   *    * *
		 *   *    * *
		 *   * *  * *
		 */

		
		int arr []= {3,1,0,7,5};
		int max =Integer.MIN_VALUE;
		for(int i : arr)
		{
			max=Math.max(i, max);
		}
		
		
		for(int f=max;f>0;f--)
		{
			for(int i : arr)
			{
				if(i>=f)
				System.out.print("*\t");
				else
				System.out.print("\t");
					
			}
			System.out.println();
		}

	}

}
