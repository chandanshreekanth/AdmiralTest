package launch;

public class ChangingPositions 
{
	 public static void main(String[] args) {
	        String s = "chandan";
//	        System.out.println(s);
	        for (int i = 0; i < s.length(); i++) {
	            String rotated = s.substring(i) + s.substring(0, i);
	            System.out.println(rotated);
	        }
	    }
}
