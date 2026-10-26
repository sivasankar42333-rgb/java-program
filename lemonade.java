import java.util.*;
class Solution 
{
	public boolean change(int[] arr)
	{
                 int five=0;
		 int ten=0;
		 for(int i=0;i<arr.length;i++)
		 {
		 	if(arr[i]==5)
			{
                        	five=five+1;
  			}
			if(arr[i]==10)
			{
				if(five>=1)
              			{
					ten=ten+1;
					five--;
				}
				else
				{
					return false;
				}
			}
			if(arr[i]==20)
			{
				if(five>=1 && ten>=1)
				{
				 	five--;
					ten--;
				}
				else
				{
					if(five>=3)
					{
						five--;
					}
					else
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}
class lemonade
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = scn.nextInt();
		System.out.println("Enter the array elements : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();
		}
		Solution sol = new Solution();
		boolean ans = sol.change(arr);
		if(ans)
		{
			System.out.println("Owner can give change to all the customer ");
		}
		else
		{
			System.out.println("Owner can't give change to all the customer ");
		}
	}
}
	