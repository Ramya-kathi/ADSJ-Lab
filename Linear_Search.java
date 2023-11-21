import java.util.*;
public class Main
{
    static int linear(int a[] , int el , int n)
    {
        for(int i =0 ;i < n; i++)
        {
            if(el == a[i])
                return i;
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int []a = new int[n];
	    for ( int i = 0; i < n ; i++ )
	    {
	        a[i] = sc.nextInt();
	    }
	    System.out.println("enter el to be search");
	    int el = sc.nextInt();
	    int x = linear(a,el,n);
	    if(x == -1 )
	        System.out.println("element not found");
	    else
	        System.out.println("element "+el+" found at index"+ x);
	}
}
