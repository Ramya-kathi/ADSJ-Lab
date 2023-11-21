import java.util.*;
public class Main
{
    static int linear(int a[] , int el)
    {
        for(int i =0 ;i < 5; i++)
        {
            if(el == a[i])
                return i;
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int []a = new int[5];
	    for ( int i = 0; i < 5 ; i++ )
	    {
	        a[i] = sc.nextInt();
	    }
	    System.out.println("enter el to be search");
	    int el = sc.nextInt();
	    int x = linear(a,el);
	    if(x == -1 )
	        System.out.println("element not found");
	    else
	        System.out.println("element "+el+" found at index"+ x);
	}
}
