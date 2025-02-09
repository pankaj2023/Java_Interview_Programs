
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Pankaj";
		int n = s.length();
		char[] arr = s.toCharArray();
		String reverse="";
		for(int i=n-1;i>=0;i--)
		{
			reverse = reverse + arr[i]; 
			
		}
		
	}

}
