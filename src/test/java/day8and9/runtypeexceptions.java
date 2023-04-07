package day8and9;

public class runtypeexceptions {

	public static void main(String[] args) {
		int[] a= new int[4];
		String[] s= new String[3];
		a[0]=5;
		a[1]=10;
		a[2]=30;
		a[3]=30;
		a[4]=45;
		
		int sum=0;
		
		for(int i=0; i<=a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array elements is "+sum);
	}

}
